package aco_practica1;

import aco_practica1.conjunto.Conjunto;
import aco_practica1.grafos.Arista;
import aco_practica1.grafos.Grafo;
import aco_practica1.grafos.Vertice;
import java.util.ArrayList;
import java.util.List;

public class Cobertura {
    
    public static List cobertura(Grafo g){
        
        
        List<Arista> e = g.aristas();
        List<Vertice> s = new ArrayList<>();
     
        while(!e.isEmpty()){
            Arista uv = e.get(0);
            List<Arista> ep = new ArrayList<>();
            for (Arista arista : e) {
                if(arista.getInicio()==uv.getInicio() || arista.getFin()==uv.getInicio()
                    ||arista.getInicio()==uv.getFin()  || arista.getFin()==uv.getFin()){
                    ep.add(arista);
                }
            }
            s.add(uv.getInicio());
            s.add(uv.getFin());
            
            
            
        }

        
        return s;
        
    }

}
