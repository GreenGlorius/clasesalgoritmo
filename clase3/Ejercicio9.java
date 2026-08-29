package clase3;

import java.util.Scanner;

/*Leer números enteros  y  guardarlos en  un  array.  Luego  solicitar  un  número al  usuario  e 
indicar: 
a. Si el número se encuentra en el array. 
b. Cuantas veces aparece. 
c. En qué posiciones aparece */
public class Ejercicio9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe 5 numeros");
        int[] numeros = new int[5];
        for(int i = 0; i<5; i++){
            numeros[i] = sc.nextInt();
        }
        System.out.println("Ingresa un numero al azar");
        int numero = sc.nextInt();
        int cantidad = 0;
        for(int i = 0; i<5; i++){
            if(numero == numeros[i]){
                cantidad ++;
                System.out.println("posición: " + (i+1));
            }
        }
        System.out.println("aparecio " + cantidad + " veces");
        sc.close();
    }
}