package aco_practica3.grafos;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
    
    private int nV;
    private Vertice[] vertices;
    private int aristas;

    public Vertice[] getVertices() {
        return vertices;
    }
    
    
    public Grafo(int n){
        nV = n;
        aristas=0;
        vertices = new Vertice[n];
        for (int i = 0; i < vertices.length; i++) {
            vertices[i]= new Vertice(i);
            
        }
       
    }
    
    public void connect(int i, int j){
        
        if(!isConnected(i,j)){
            if(i>j){
                int temp = i;
                i = j;
                j = temp;
            }
            Arista aux = vertices[i].getArista();
            if(aux==null){
                vertices[i].setArista(new Arista(vertices[i],vertices[j]));
            } else {
                
                vertices[i].setArista(new Arista(vertices[i],vertices[j]));
                vertices[i].getArista().setNext(aux);

            }
            aristas++;
        }
    }
    
    public void disconnect(int i, int j){
        
        if(isConnected(i,j)){
            if(i>j){
                int temp = i;
                i = j;
                j = temp;
            }
            Arista aux= vertices[i].getArista();
            Arista next = aux.getNext();
            if(aux.getInicio().getNum()==i&&aux.getFin().getNum()==j){
                vertices[i].setArista(next);
                aristas--;
                return;
            }
            while(aux.hasNext()){
                if(next.getInicio().getNum()==i&&next.getFin().getNum()==j){
                    aux.setNext(next.getNext());
                    aristas--;
                    return;
                }
                aux=next;
                next=next.getNext();
            }
            
        }        
    }

    public int getAristas() {
        return aristas;
    }

    public boolean isConnected(int i, int j){
        if(i>j){
            int temp = i;
            i = j;
            j = temp;
        }
        
        Arista aux = vertices[i].getArista();
        if(aux==null) return false;
        while(aux.hasNext()){
            
            if(aux.getInicio().getNum()==i&&aux.getFin().getNum()==j){
                return true;
                
            }
            aux=aux.getNext();
        }
        if(aux.getNext()==null){
            if(aux.getInicio().getNum()==i&&aux.getFin().getNum()==j){
                return true;
                
            }
            return false;
        }
        return false;
    }
    
    public int getnV() {
        return nV;
    }

    public List<Arista> aristas() {
        List<Arista> list = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < vertices.length; i++) {
            Arista aux = vertices[i].getArista();
            if(aux!=null){
                
                list.add(aux);
                j++;
                while(aux.hasNext()){
                    aux=aux.getNext();
                   
                    list.add(aux);
                    
                }
            }
            
        }
        return list;
    }
    
}
