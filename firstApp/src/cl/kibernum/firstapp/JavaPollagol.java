package cl.kibernum.firstapp;

import java.util.Arrays;

public class JavaPollagol {

    public static void main(String[] args) {
        int[] num =generaNumero();
        System.out.println( Arrays.toString(num));
    }
    private static int[] generaNumero(){
        int maximo = 6;
        int maximoDigito = 35;
        int cont = 0;
        int[]numeros= new int[maximo];
        for (int i = 0; i < maximo; i++) {
            int random = (int)(1+(Math.random()*maximoDigito));
            if(Arrays.binarySearch(numeros, random)<0){
                numeros[cont++] = random;
            }
        }
        return numeros;
    }
}


