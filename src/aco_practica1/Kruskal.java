package aco_practica1;

import aco_practica1.conjunto.Conjunto;
import aco_practica1.grafos.Arista;
import aco_practica1.grafos.Grafo;
import java.util.LinkedList;
import java.util.List;

public class Kruskal {
    
    public static List Kruskal(Grafo g, Arista[] a){
        
        
        OrdenaAristas.ordena(a,0,a.length);
        
        int n = g.getnV();
        List<Arista> t = new LinkedList<>();
        int[] conjunto = new int[n];
        Conjunto.inicializa(conjunto,n);
        
        

        
        return t;
        
    }

}
