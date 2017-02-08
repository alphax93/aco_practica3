package aco_practica1;

import aco_practica1.grafos.Arista;
import aco_practica1.grafos.Grafo;
import aco_practica1.grafos.Vertice;
import java.util.ArrayList;
import java.util.Iterator;
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
        int i ;
        List<Integer> lista = new ArrayList<>();
        
        for (int j = 0; j < visitados.length; j++) {
            Arista p;
            if(g.getVertices()[j].getArista()!=null){
                p=g.getVertices()[j].getArista();
            }else {
                return false;
            }
            while(p.hasNext()){
                if(p.getInicio() == j && lista.contains(p.getFin())){
                    lista.add(p.getFin());
                }else if(p.getFin() == j && lista.contains(p.getInicio())){
                    lista.add(p.getInicio());
                }
                p=p.getNext();
            }

        }
        Iterator <Integer> it = lista.iterator();
        while(it.hasNext()){
            i=it.next();
            if(!visitados[i]){
                if(hayCiclos(g,i,visitados,v)){
                    return true;
                }
            } else if(i!=parent){
                return true;
            }
        }
        
        
        return false;
    }
    
}