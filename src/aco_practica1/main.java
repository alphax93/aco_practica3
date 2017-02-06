package aco_practica1;

import aco_practica1.grafos.Arista;
import aco_practica1.grafos.Grafo;
import java.util.List;

public class main {

    public static void main(String[] args) {
        
        Grafo g = new Grafo(7);
        g.connect(0, 2, 1);
        g.connect(1, 2, 2);
        g.connect(3, 4, 4);
        g.connect(4, 5, 8);
        g.connect(2, 6, 1);
        g.connect(0, 3, 1);
        g.connect(1, 4, 1);
        g.connect(4, 6, 1);
        g.connect(2, 5, 6);
        g.connect(0, 4, 6);
        g.connect(2, 4, 4);
        g.connect(3, 6, 1);
        g.connect(5, 6, 1);
        
        /*Grafo s=new Grafo(3);
        s.connect(0, 1, 1);
        s.connect(0, 2, 1);
        s.connect(2, 1, 1);
        */
        
        System.out.println(Pruebas.conexo(g,g.aristas()));
        
        //List<Arista> result1=Kruskal.Kruskal(s);
        List<Arista> result=Kruskal.Kruskal(g);
        
       
        System.out.println(Pruebas.conexo(g,result.toArray(new Arista[0])));
        System.out.println(Pruebas.tamano(g.getnV(),result));
        
        /*System.out.println(Pruebas.conexo(s,result1.toArray(new Arista[0])));
        System.out.println(Pruebas.tamano(s.getnV(),result1));*/
        
        System.out.println("-----------------------");
        for (Arista arista : result) {
            System.out.println(arista.getInicio() + " " + arista.getFin());
        }
    }
}
