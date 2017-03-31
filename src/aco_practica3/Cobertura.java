package aco_practica3;

import aco_practica3.grafos.Arista;
import aco_practica3.grafos.Grafo;
import aco_practica3.grafos.Vertice;
import java.util.ArrayList;
import java.util.List;

public class Cobertura {
    
    public static List cobertura(Grafo g){
        
        
        List<Arista> e = g.aristas();
        List<Vertice> s = new ArrayList<>();
     
        while(!e.isEmpty()){
            int r = (int)(Math.random() * (e.size()-1));
            
            Arista uv = e.get(r);
            List<Arista> ep = new ArrayList<>();
            for (Arista arista : e) {
                if(arista.getInicio()==uv.getInicio() || arista.getFin()==uv.getInicio()
                    ||arista.getInicio()==uv.getFin()  || arista.getFin()==uv.getFin()){
                    ep.add(arista);
                }
            }
            s.add(uv.getInicio());
            s.add(uv.getFin());
            e.removeAll(ep);
            
            
        }

        
        return s;
        
    }

}
