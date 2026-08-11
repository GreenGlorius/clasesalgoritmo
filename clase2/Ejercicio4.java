package clase2;
/*Leer un número y decir si está entre 10 y 100 */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su numero: ");
        double num = sc.nextDouble();

        if(num >= 10 && num <= 100){
            System.out.println("El numero está entre 10 y 100");
        } else if(num < 10){
            System.out.println("el numero es menor que 10");
        } else {
            System.out.println("el numero es mayor que 100");
        }
        sc.close();
    }
    
}
