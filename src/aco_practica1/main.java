package aco_practica1;

import aco_practica1.grafos.Arista;
import aco_practica1.grafos.Grafo;
import java.util.List;

public class main {

    public static void main(String[] args) {
        
        Grafo g = new Grafo(4);
        g.connect(0, 1, 3);
        g.connect(1, 2, 4);
        g.connect(2, 0, 1);
        g.connect(0, 3, 1);
        g.connect(3, 2, 2);
        
        System.out.println(g.isConnected(0,1));
        System.out.println(g.isConnected(2,1));
        System.out.println(g.isConnected(0,2));
        System.out.println(g.isConnected(0,3));
        System.out.println(g.isConnected(3,2));
       
        
        Arista[] a = g.aristas();
        
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].getInicio() +" "+ a[i].getFin() + " " + a[i].getPeso());
        }
        
        OrdenaAristas.ordena(a,0,a.length);
        
        System.out.println("-----------------------");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].getInicio() +" "+ a[i].getFin() + " " + a[i].getPeso());
        }
        List<Arista> result=Kruskal.Kruskal(g,a);
        
        System.out.println("-----------------------");
        for (Arista arista : result) {
            System.out.println(arista.getInicio() + " " + arista.getFin());
        }
    }
}
