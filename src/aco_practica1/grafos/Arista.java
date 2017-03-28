package aco_practica1.grafos;

public class Arista {
    
    
    int peso;
    Arista next;
    Vertice inicio;
    Vertice fin;

    public Arista(int peso, Vertice i, Vertice j) {
        this.inicio = i;
        this.fin = j;
        this.peso = peso;
        next=null;
    }

    public Vertice getInicio() {
        return inicio;
    }

    public Vertice getFin() {
        return fin;
    }

    public int getPeso() {
        return peso;
    }

    public Arista getNext() {
        return next;
    }

    public boolean hasNext(){
        if(next!=null){
            return true;
        }
        return false;
    }
    
    public void setNext(Arista next) {
        this.next = next;
    }
    
    
            
}
