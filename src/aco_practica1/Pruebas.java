package aco_practica1;

import aco_practica1.grafos.Arista;
import aco_practica1.grafos.Grafo;
import java.util.List;

public class Pruebas {
    
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
    
    public static boolean tamano(int n, List<Arista> list){
        if(n-1!=list.size()) return false;
        return true;
    }
    
    public static boolean ciclo(Grafo g, Arista[] aristas ){
        int[] visitados = new int[g.getnV()];
        boolean hay = false;
        for (int i = 0; i < visitados.length && !hay; i++) {
            if(visitados[i]==0)hay=hayCiclos(g,aristas,visitados,i);
            
        }
        return hay;
    }
    
    private static boolean hayCiclos(Grafo g, Arista[] aristas,int[] visitados, int origen){
        visitados[origen]=1;
        boolean atras= false;
        Arista l = 
        return false;
    }
    
}
