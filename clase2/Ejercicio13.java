package clase2;

import java.util.Scanner;
import java.util.ArrayList;
/*Leer números hasta encontrar un número negativo */
public class Ejercicio13 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese numeros hasta poner un negativo");
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero;
        while((numero = sc.nextInt()) >= 0){
            numeros.add(numero);
        }
        System.out.println("ingresó " + numeros.size() + " numeros antes de poner un negativo");
     sc.close();
    }
}
