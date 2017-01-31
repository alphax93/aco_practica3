package aco_practica1.grafos;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
    
    private int nV;
    private Vertice[] vertices;
    
    
    public Grafo(int n){
        nV = n;
        vertices = new Vertice[n];
        for (int i = 0; i < vertices.length; i++) {
            vertices[i]= new Vertice(i);
            
        }
       
    }
    
    public void connect(int i, int j, int value){
        
        if(!isConnected(i,j)){
            if(i>j){
                int temp = i;
                i = j;
                j = temp;
            }
            Arista aux = vertices[i].getArista();
            if(aux==null){
                vertices[i].setArista(new Arista(i,j,value));
            } else {
                
                vertices[i].setArista(new Arista(i,j,value));
                vertices[i].getArista().setNext(aux);

            }
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
            if(aux.getInicio()==i&&aux.getFin()==j){
                vertices[i].setArista(next);
            }
            while(aux.hasNext()){
                if(next.getInicio()==i&&next.getFin()==j){
                    aux.setNext(next.getNext());
                }
            }
        }        
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
            
            if(aux.getInicio()==i&&aux.getFin()==j){
                return true;
                
            }
            aux=aux.getNext();
        }
        if(aux.getNext()==null){
            if(aux.getInicio()==i&&aux.getFin()==j){
                return true;
                
            }
            return false;
        }
        return false;
    }
    
    public int getnV() {
        return nV;
    }

    public Arista[] aristas() {
        List<Arista> list = new ArrayList<>();
        for (int i = 0; i < vertices.length; i++) {
            Arista aux = vertices[i].getArista();
            if(aux!=null){
                list.add(aux);
                while(aux.hasNext()){
                    aux=aux.getNext();
                    list.add(aux);
                }
            }
            
        }
        return list.toArray(new Arista[0]);
    }
    
}
