package aco_practica3.grafos;

public class Arista {
    
    
    
    Arista next;
    Vertice inicio;
    Vertice fin;

    public Arista(Vertice i, Vertice j) {
        this.inicio = i;
        this.fin = j;
        next=null;
    }

    public Vertice getInicio() {
        return inicio;
    }

    public Vertice getFin() {
        return fin;
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
