package clase2;

import java.util.Scanner;
/* Leer un número entero mayor que 0. Calcular la suma de todos sus dígitos. Por ejemplo, 
el número 370 corresponderá al valor 10 (3+7+0). Si el parámetro leído no es un número 
entero mayor que cero, mostrar un mensaje por consola y volver a pedir otro número. 
Permitir al usuario seguir calculando la suma de dígitos hasta que decida salir del 
programa.  */
public class Ejercicio29{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        externo: while(true){
            int numero = -1;
            while(numero <= 0){
                System.out.println("Escriba un número entero mayor que 0 (o un número negativo para salir):");
                numero = sc.nextInt();
                if(numero < 0){
                    break externo;
                }
                if(numero == 0){
                    System.out.println("El número debe ser mayor que 0");
                }
            }
            
            int suma = sumarDigitos(numero);
            System.out.println("La suma de los dígitos de " + numero + " es: " + suma);
            System.out.println();
        }
        sc.close();
    }
    
    public static int sumarDigitos(int numero){
        int suma = 0;
        while(numero > 0){
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
    }
}