package aco_practica3;

import aco_practica3.grafos.Arista;
import aco_practica3.grafos.Grafo;
import aco_practica3.grafos.Vertice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

public class Pruebas {
    
    public static boolean conexo(Grafo g){
        List<Arista> aristas = g.aristas();
        List<Vertice> visitados = new ArrayList<>();
        for (Arista arista : aristas) {
            if(!visitados.contains(arista.getInicio()))visitados.add(arista.getInicio());
            if(!visitados.contains(arista.getFin()))visitados.add(arista.getFin());
            
        }
        if(visitados.size()==g.getnV()) return true;
        return false;
    }
}