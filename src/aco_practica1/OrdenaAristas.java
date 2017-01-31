package aco_practica1;

import aco_practica1.grafos.Arista;

public class OrdenaAristas {
    
    public static void ordena(Arista[] a, int ini, int n){
        if(n>1){
            int n1 = n/2;
            int n2= n - n1;
            ordena(a,ini,n1);
            ordena(a,n1+1, n2);
            merge(a, ini, n1,n2);
        }
    }

    private static void merge(Arista[] a, int ini, int n1, int n2) {
        Arista[] buffer = new Arista[n1+n2];
        int temp = 0;
        int temp1 = 0;
        int temp2 = 0;
        while ((temp1<n1)&&(temp2<n2)){
            if(a[ini+temp1].getPeso()<a[ini+n1+temp2].getPeso()){
                buffer[temp++] = a[ini + (temp1++)];
            }else{
                buffer[temp++] = a[ini + n1 + (temp2++)];
            }
        }
        while(temp1 < n1){
            buffer[temp++] = a[ini + temp1++];
        }
        while(temp2 < n2){
            buffer[temp++] = a[ini + n1 + temp2++];
        }
        for (int i = 0; i < n1+n2; i++) {
            a[ini+i] = buffer[i];
            
        }
        
    }
    
}
