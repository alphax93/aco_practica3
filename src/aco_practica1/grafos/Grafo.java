package aco_practica1.grafos;

public class Grafo {
    
    private int nV;
    private boolean mA[][];
    
    public Grafo(int n){
        nV = n;
        mA = new boolean[n][n];
        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mA.length; j++) {
                mA[i][j]=false;
            }
        }
    }
    
    public void conectar(int i, int j){
        mA[i][j]=true;
        mA[j][i]=true;
        
    }
    
    public void desconectar(int i, int j){
        mA[i][j]=false;
        mA[j][i]=false;
        
    }

    public boolean conectados(int i, int j){
        return mA[i][j];
    }
    
    public int getnV() {
        return nV;
    }
    
    
}
