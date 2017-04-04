package aco_practica3;

import aco_practica3.grafos.Arista;
import aco_practica3.grafos.Grafo;
import aco_practica3.grafos.Vertice;
import java.util.List;

public class main {

    public static void main(String[] args) {
        
        //Creacion del grafo inicial, modificar el número cuando sea necesario
        Grafo original = new Grafo(6);
        generaOriginal(original);
        if(Pruebas.conexo(original)){
            List<Vertice> result = Cobertura.cobertura(original);
            for (Vertice vertice : result) {
                System.out.println(vertice.getNum());
            }
            if(!Pruebas.resultado(original,result)){
                System.out.println("Resultado incorrecto");
            }
            if(!Pruebas.cantidad(3, result.size())){
                System.out.println("Cantidad de vértices del resultado incorrecta");
            }
        } else {
            System.out.println("Grafo no conexo");
        }
        
        
    }
    //Usar este metodo para las conectar los vertices del grafo original 
    private static void generaOriginal(Grafo original){
            original.connect(0,1);
            original.connect(0,4);
            original.connect(0,5);
            original.connect(1,2);
            original.connect(1,3);
            original.connect(1,4);
            original.connect(3,4);
            
            
   }
    
    
            
}
