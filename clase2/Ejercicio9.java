package clase2;

import java.util.Scanner;
/*Promedio. Leer N números (definido por el usuario) y luego mostrar el promedio.*/
public class Ejercicio9 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos numeros desea ingresar?");
        int cantidad = sc.nextInt();
        int[] numeros = new int[cantidad];
        for(int i = cantidad ; i > 0; i--){
            System.out.println("le quedan por ingresar " + i + " numeros");
            numeros[i-1] = sc.nextInt();
        }
        int suma = 0;
        for (int i = 0; i < cantidad; i++){
            suma = suma + numeros[i];
        }
        double promedio = suma/cantidad;
        System.out.println("el promedio es: " + promedio);
        sc.close();
    }
}
