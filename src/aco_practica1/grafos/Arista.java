package aco_practica1.grafos;

public class Arista {
    
    int inicio;
    int fin;
    int peso;
    Arista next;

    public Arista(int inicio, int fin, int peso) {
        this.inicio = inicio;
        this.fin = fin;
        this.peso = peso;
        next=null;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFin() {
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
