package clase2;

import java.util.Scanner;
/*Suma acumulada. Leer 5 números y mostrar la suma total de los 5.*/
public class Ejercicio8 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe 5 numeros");
        int[] numeros = {sc.nextInt(), sc.nextInt(), sc.nextInt() ,sc.nextInt(), sc.nextInt()};
        int suma = 0;
        for (int i = 0; i < 5; i++){
            suma = suma + numeros[i];
        }
        System.out.println("la suma total es: " + suma);
        sc.close();
    }
}