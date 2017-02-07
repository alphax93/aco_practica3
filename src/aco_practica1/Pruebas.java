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
        for (int i = 0; i < con.length; i++) {
            con[aristas[i].getInicio()]=true;
            con[aristas[i].getFin()]=true;
        }
        for (int i = 0; i < con.length; i++) {
            if(!con[i]) return false;
            
        }
        
        return true;
    }
    
    public static boolean tamano(int n, List<Arista> list){
        if(n!=list.size()) return false;
        return true;
    }
    
}
