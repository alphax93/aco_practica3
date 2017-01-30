package aco_practica1.grafos;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
    
    private int nV;
    private Vertice[] vertices;
    
    /*private boolean mA[][];
    private int cost[][];
    */
    public Grafo(int n){
        nV = n;
        vertices = new Vertice[n];
        for (int i = 0; i < vertices.length; i++) {
            vertices[i]= new Vertice(i);
            
        }
       /* mA = new boolean[n][n];
        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mA.length; j++) {
                mA[i][j]=false;
            }
        }
        cost = new int[n][n];
        for (int i = 0; i < cost.length; i++) {
            for (int j = 0; j < cost.length; j++) {
                cost[i][j]=0;
            }
        }*/
    }
    
    public void connect(int i, int j, int value){
        
        if(i>j){
            int temp = i;
            i = j;
            j = temp;
        }
        Arista aux = vertices[i].getArista();
        if(aux==null){
            
            vertices[i].setArista(new Arista(i,j,value));
        } else {
            
            while(aux.hasNext()){
                aux=aux.getNext();
            }
            
            aux.setNext(new Arista(i,j,value));
            
        }
        /*mA[i][j]=true;
        mA[j][i]=true;
        cost[i][j]=value;
        cost[j][i]=value;*/  
    }
    
    public void disconnect(int i, int j){
        
        
        /*mA[i][j]=false;
        mA[j][i]=false;
        cost[i][j]=0;
        cost[j][i]=0;*/
    }

    public boolean isConnected(int i, int j){
        if(i>j){
            int temp = i;
            i = j;
            j = temp;
        }
        
        Arista aux = vertices[i].getArista();
        
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
    
    /*public int getCost(int i, int j){
        return cost[i][j];
    }
    
    

    public boolean[][] getmA() {
        return mA;
    }

    public int[][] getCost() {
        return cost;
    }*/
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
