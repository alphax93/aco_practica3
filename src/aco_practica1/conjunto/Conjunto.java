package aco_practica1.conjunto;

public class Conjunto {
    
    private int conjunto[];
    private int size;
    
    public Conjunto(int n){
        conjunto=new int[n];
        size=n;
    }

    public int[] getConjunto() {
        return conjunto;
    }

    public void inicializa(){
        for (int i = 0; i < size; i++) {
            conjunto[i]=0;
            
        }
    }
    
    public int buscar(int x){
        int i = x;
        while(conjunto[i]>0){
            i=conjunto[i];
        }
        return i;
    }

    public void fusionar(int a, int b){
        if(conjunto[a]==conjunto[b]){
            conjunto[a]=conjunto[a]-1;
            conjunto[b]=a;
        }else{
            if(conjunto[a]<conjunto[b]){
                conjunto[b]=a;
            }else{
                conjunto[a]=b;
            }
        }        
    }
}
