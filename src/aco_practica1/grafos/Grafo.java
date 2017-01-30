package aco_practica1.grafos;

public class Grafo {
    
    private int nV;
    private boolean mA[][];
    private int cost[][];
    
    public Grafo(int n){
        nV = n;
        mA = new boolean[n][n];
        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mA.length; j++) {
                mA[i][j]=false;
            }
        }
        cost = new int[n][n];
        for (int i = 0; i < cost.length; i++) {
            for (int j = 0; j < cost.length; j++) {
                cost[i][j]=0;
            }
        }
    }
    
    public void connect(int i, int j, int value){
        mA[i][j]=true;
        mA[j][i]=true;
        cost[i][j]=value;
        cost[j][i]=value;
        
    }
    
    public void disconnect(int i, int j){
        mA[i][j]=false;
        mA[j][i]=false;
        cost[i][j]=0;
        cost[j][i]=0;
    }

    public boolean isConnected(int i, int j){
        return mA[i][j];
    }
    
    public int getCost(int i, int j){
        return cost[i][j];
    }
    
    public int getnV() {
        return nV;
    }

    public boolean[][] getmA() {
        return mA;
    }

    public int[][] getCost() {
        return cost;
    }
    
    
}
