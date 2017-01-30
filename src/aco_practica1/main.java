package aco_practica1;

import aco_practica1.grafos.Grafo;

public class main {

    public static void main(String[] args) {
        
        Grafo g = new Grafo(3);
        Kruskal.Kruskal(g);
    }
}
