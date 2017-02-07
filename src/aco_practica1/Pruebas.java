package aco_practica1;

import aco_practica1.grafos.Arista;
import aco_practica1.grafos.Grafo;
import aco_practica1.grafos.Vertice;
import java.util.List;

public class Pruebas {
    
    public static void pruebas(Grafo original, Grafo kruskal){
        if(kruskal==null){
            if(!conexo(original,original.aristas()))System.out.println("Original: Grafo no conexo");
            if(ciclo(original)) System.out.println("Original: Hay ciclos");
        } else {
            if(!conexo(kruskal,kruskal.aristas()))System.out.println("Kruskal: Grafo no conexo");
            if(!tamano(kruskal.getnV(),kruskal.getAristas())) System.out.println("Kruskal: Cantidad de aristas distina a n-1");
            if(ciclo(kruskal)) System.out.println("Kruskal: Hay ciclos");
        }
        
    }
    
    public static boolean conexo(Grafo g, Arista[] aristas){
        boolean[] con = new boolean[g.getnV()];
        
        for (int i = 0; i < con.length; i++) {
            con[i]=false;
            
        }
        for (int i = 0; i < aristas.length; i++) {
            con[aristas[i].getInicio()]=true;
            con[aristas[i].getFin()]=true;
        }
        for (int i = 0; i < con.length; i++) {
            if(!con[i]) return false;
            
        }
        
        return true;
    }
    
    public static boolean tamano(int n, int m){
        if(n-1!=m) return false;
        return true;
    }
    
    public static boolean ciclo(Grafo g){
        boolean[] visitados = new boolean[g.getnV()];
        for (int i = 0; i < visitados.length; i++) {
            visitados[i]=false;
        }
        for (int i = 0; i < g.getnV(); i++) {
            if(!visitados[i]){
                if(hayCiclos(g,i,visitados,-1)) return true;
            }
            
        }
        return false;
    }
    
    private static boolean hayCiclos(Grafo g,int v,boolean[] visitados, int parent){
        visitados[v]=true;
        Arista i;
        if(g.getVertices()[v].getArista()!=null){
            i = g.getVertices()[v].getArista();
        }else {
            return false;
        }
        while(i.hasNext()){
            i=i.getNext();
            if(!visitados[i.getInicio()]){
                if(hayCiclos(g,i.getInicio(),visitados,v)){
                    return true;
                }
            } else if(i.getInicio()!=parent){
                return true;
            }
        }
        
        
        return false;
    }
    
}
