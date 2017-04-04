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
    
    public static boolean resultado(Grafo g, List<Vertice> result){
    
        List<Arista> aristas = g.aristas();
        
        /*for (Vertice vertice : result) {
            for (Arista arista : aristas) {
                if(arista.getInicio()==vertice){
                    if(!resto.contains(arista.getFin()) && !result.contains(arista.getFin())){
                        resto.add(arista.getFin());
                    }
                }
                if(arista.getFin()==vertice){
                    if(!resto.contains(arista.getInicio())&&!result.contains(arista.getInicio())){
                        resto.add(arista.getInicio());
                    }
                }
            }
        }
       
        if(resto.size() == g.getnV()-result.size()) return true;*/
        List<Arista> tmp = new ArrayList<>();
        for (Vertice vertice : result) {
            
            for (Arista arista : aristas) {
                
                if(arista.getInicio()==vertice || arista.getFin()==vertice){
                    if(!tmp.contains(arista)){
                        tmp.add(arista);
                    }
                }
            }
        }
        
        if(aristas.size()==tmp.size()) return true;
        return false;
    }
    
    public static boolean cantidad(int minimo, int resultado){
        if(resultado<=2*minimo) return true;
        return false;
    }
}