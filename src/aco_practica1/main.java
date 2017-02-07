package aco_practica1;

import aco_practica1.grafos.Arista;
import aco_practica1.grafos.Grafo;
import java.util.List;

public class main {

    public static void main(String[] args) {
        
        //Creacion del grafo inicial, modificar el número cuando sea necesario
        Grafo original = new Grafo(3);
        generaOriginal(original);
        
        //Pruebas del original
        Pruebas.pruebas(original, null);
        
        //Obtencion de las aristas correctas y creación del nuevo grafo 
        List<Arista> result=Kruskal.Kruskal(original);
        Grafo kruskal = new Grafo(original.getnV());
        generaKruskal(kruskal,result);
        
        //Pruebas de kruskal
        Pruebas.pruebas(original, kruskal);
        
    }
    //Usar este metodo para las conectar los vertices del grafo original 
    private static void generaOriginal(Grafo original){
        original.connect(0,1,1);
        original.connect(0,2,1);
        original.connect(1,2,1);
    }
    
    //Usar este método para crear el nuevo grafo que usa solo las aristas obtenidas en Kruskal
    private static void generaKruskal(Grafo g, List<Arista> list){
        for (Arista arista : list) {
            g.connect(arista.getInicio(),arista.getFin(),arista.getPeso());
        }
    }
            
}
