package aco_practica1;

import aco_practica1.conjunto.Conjunto;
import aco_practica1.grafos.Arista;
import aco_practica1.grafos.Grafo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kruskal {
    
    public static List Kruskal(Grafo g, Arista[] a){
        
        
        OrdenaAristas.ordena(a,0,a.length);
        List<Arista> aristas = new ArrayList<Arista>(Arrays.asList(a));
        
        int n = g.getnV();
        List<Arista> t = new ArrayList<>();
        int[] conjunto = new int[n];
        Conjunto.inicializa(conjunto,n);
     
        while(t.size()<n-1){
            Arista uv = aristas.get(0);
            aristas.remove(0);
            
            int uconj = Conjunto.buscar(conjunto,n,uv.getInicio());
            int vconj = Conjunto.buscar(conjunto,n,uv.getFin());
            if(uconj!=vconj){
                Conjunto.fusionar(conjunto,n,uconj,vconj);
                t.add(uv);
            }
        }

        
        return t;
        
    }

}
