package clase4;

import java.util.Scanner;

/*  Funciones con retorno*: 
a.  Crear las siguientes funciones: 
sumar(int a, int b) 
restar(int a, int b) 
multiplicar(int a, int b) 
b.  Cada función deberá retornar el resultado correspondiente. 
c.  Desde main, solicitar dos números al usuario y utilizar las funciones para 
mostrar los resultados. */
public class Ejercicio2 {
    public static int sumar(int a, int b){
        return a + b;
    }

    public static int restar(int a, int b){
        return a - b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("escriba sus dos numeros");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumar(a, b) + "  " + restar(a, b) + "  " + multiplicar(a, b));
        sc.close();
    }
}
