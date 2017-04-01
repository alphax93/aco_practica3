package aco_practica3;

import aco_practica3.grafos.Arista;
import aco_practica3.grafos.Grafo;
import aco_practica3.grafos.Vertice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

public class Pruebas {
    
    public static boolean conexo(Grafo g){
        
       // List<Vertice> vertices = Arrays.asList(g.getVertices());
        List<Vertice> vertices = new ArrayList<>();
        vertices.add(g.getVertices()[0]);
        List<Vertice> visitados = new ArrayList<>();
        List<Arista> aristas = g.aristas();
        while(!vertices.isEmpty()){
            Vertice tmp = vertices.get(0);
            vertices.remove(0);
            if(!visitados.contains(tmp)){
                visitados.add(tmp);
                for (Arista arista : aristas) {
                    if(arista.getInicio()==tmp){
                        vertices.add(arista.getFin());
                    }
                    if(arista.getFin()==tmp){
                        vertices.add(arista.getInicio());
                    }
                }
            }
            
        }
        if(visitados.size()==g.getnV()) return true;
        
        return false;
    }
}