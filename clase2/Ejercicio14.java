package clase2;

import java.util.Scanner;

/*Teniendo en cuenta el ejercicio de mostrar un menú de opciones de la sección anterior, 
refactorizarlo de tal manera que después de elegir una opción y mostrar el resultado por 
consola, el usuario pueda seguir seleccionando opciones hasta que elija la opción de 
salir. */
public class Ejercicio14 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String[] opciones = {"suma","resta","multiplicacion","division","salir"};
        while(true){
            for(int i = 0;i<5;i++){
                System.out.println((i+1) + ". " + opciones[i]);
            }
            System.out.println("escriba el numero de que deasea realizar");
            int opcion = sc.nextInt();
            if(opcion == 5){
                System.out.println("session terminada");
                break;
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
                        break;
                    default:
                        System.out.println("operacion no encontrada");
                        break;
                }
                System.out.println("resultado: " + resultado);
            }
        }
        sc.close();
    }
}
