package clase2;

import java.util.Scanner;
/*Par/Impar en bucle. Leer 10 números y mostrar cuántos son pares y cuántos impares. 
Hacer una prueba de escritorio. */
public class Ejercicio11 {
    public static void main (String [] args){
        
     Scanner sc = new Scanner(System.in);
     System.out.println("Escriba 10 numeros");
     int[] numeros = new int [10];
     int contador = 10;
     int pares = 0;
     int impares = 0;
     int ceros = 0;
        
        for(int i = 0; i < 10; i++){
         System.out.println("le quedan por escribir " + contador + " numeros");
         numeros[i] = sc.nextInt();
         contador --;
        }
        for(int i = 0; i < 10; i++){
            if(numeros[i] == 0){
                ceros ++;
            }else if(numeros[i] % 2 == 0) {
                pares ++;
            }else if (numeros[i] % 2 == 1) {
                impares ++;
            }
        }
        if (pares > 0){
            System.out.println("hay " + pares + " pares");
        }
        if (impares > 0){
            System.out.println("hay " + impares + " impares");
        }
        if (ceros > 0){
            System.out.println("hay " + ceros + " ceros");
        }
     sc.close();
    }
}
