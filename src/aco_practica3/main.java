package aco_practica3;

import aco_practica3.grafos.Arista;
import aco_practica3.grafos.Grafo;
import java.util.List;

public class main {

    public static void main(String[] args) {
        
        //Creacion del grafo inicial, modificar el número cuando sea necesario
        Grafo original = new Grafo(7);
        generaOriginal(original);
        
        
        
    }
    //Usar este metodo para las conectar los vertices del grafo original 
    private static void generaOriginal(Grafo original){
            original.connect(0, 1);
     
   }
    
    
            
}
