package clase2;

import java.util.Scanner;

/*Leer 2 números y un operador (+, -, *, /). Aplicar la operación dependiendo del operador
recibido y mostrar el resultado. */
public class Ejercicio5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe 2 numeros");
        int A = sc.nextInt(), B = sc.nextInt();
        System.out.println("Escriba su operador + - * o /");
        String Op = sc.next();
        double resultado = 0;
        switch (Op) {
            case "+":
                resultado = A + B;
                break;
            case "-":
                resultado = A - B;
                break;
            case "*":
                resultado = A * B;
                break;
            case "/":
                if(B != 0){
                    resultado = (double) A / B;
                } else {
                    System.out.println("no se puede dividir por 0");
                }
                break;
            default:
                System.out.println("operador invalido");
                break;
        }
        System.out.println("resultado: " + resultado);
        sc.close();
    }
    
}
