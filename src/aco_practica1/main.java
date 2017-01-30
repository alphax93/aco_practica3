package aco_practica1;

import aco_practica1.grafos.Arista;
import aco_practica1.grafos.Grafo;

public class main {

    public static void main(String[] args) {
        
        Grafo g = new Grafo(4);
        g.connect(0, 1, 3);
        g.connect(1, 2, 4);
        g.connect(2, 0, 1);
        g.connect(0, 3, 1);
        g.connect(3, 2, 2);

        
        
        Arista[] a = g.aristas();
        
        //Kruskal.Kruskal(g,a);
    }
}
