package aco_practica1.grafos;

public class Arista {
    
    int inicio;
    int fin;
    int peso;

    public Arista(int inicio, int fin, int peso) {
        this.inicio = inicio;
        this.fin = fin;
        this.peso = peso;
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
    
    
            
}
