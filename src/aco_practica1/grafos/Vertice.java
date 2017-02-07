
package aco_practica1.grafos;


public class Vertice {
    
    private int num;
    private Arista arista;
    
    public Vertice(int num) {
        this.num = num;
        arista=null;
    }

    public Arista getArista() {
        return arista;
    }

    public int getNum() {
        return num;
    }

    public void setArista(Arista arista) {
        this.arista = arista;
    }
    
    
}
