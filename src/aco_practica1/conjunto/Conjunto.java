package aco_practica1.conjunto;

public class Conjunto {
    
   

    public static void inicializa(int[] conjunto, int size){
        for (int i = 0; i < size; i++) {
            conjunto[i]=-1;
            
        }
    }
    
    public int buscar(int[] conjunto, int size, int x){
        int i = x;
        while(conjunto[i]>0){
            i=conjunto[i];
        }
        return i;
    }

    public void fusionar(int[] conjunto, int size, int a, int b){
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
