package clase2;

import java.util.Scanner;

/* Mostrar un menú de opciones para que el usuario seleccione un número del 1 al 5. Las
opciones son: Suma, Resta, Multiplicación, División, Salir. Luego leer dos números y
utilizando Switch Case, aplicar la operación seleccionada y mostrar el resultado. Si la
opción es la 5, mostrar una despedida en la consola */
public class Ejercicio6 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String[] opciones = {"suma","resta","multiplicacion","division","ninguno"};
        for(int i = 0;i<5;i++){
            System.out.println((i+1) + ". " + opciones[i]);
        }
        System.out.println("escriba el numero de que deasea realizar");
        int opcion = sc.nextInt();
        if(opcion == 5){
            System.out.println("ok adios");
        } else {
            System.out.println("Escriba 2 numeros");
            int A = sc.nextInt(), B = sc.nextInt();
            double resultado = 0;
            switch (opcion) {
                case 1:
                    resultado = A + B;
                    break;
                case 2:
                    resultado = A - B;
                    break;
                case 3:
                    resultado = A * B;
                    break;
                case 4:
                    resultado = (double) A / B;
                default:
                    System.out.println("operacion no encontrada");
                    break;
            }
            System.out.println("resultado: " + resultado);
        }

    }
    
}
