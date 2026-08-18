package clase2;

import java.util.Scanner;
/* Leer tres calificaciones de un estudiante y una letra. Si la letra es A, se deberá calcular y 
mostrar la media aritmética de las calificaciones del estudiante, si es P, se deberá 
calcular y mostrar el promedio ponderado, con pesos 5, 3 y 2. Permitir al usuario seguir 
calculando promedios hasta que decida salir del programa. */
public class Ejercicio27 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        externa: while(true){    
            System.out.println("escriba la 1er nota: ");
            double nota1 = sc.nextDouble();
            System.out.println("escriba la 2da nota: ");
            double nota2 = sc.nextDouble();
            System.out.println("escriba la 3er nota: ");
            double nota3 = sc.nextDouble();
            while(true){
            System.out.println("escriba A para ver la media de las notas, P para ver el promedio ponderado o X para salir");
            String respuesta = sc.next();
            switch (respuesta) {
                case "A":
                    double media = (nota1 + nota2 + nota3) / 3;
                    System.out.println("Media aritmética: " + media);
                    break;
                case "P":
                    double promedioPonderado = (nota1*5 + nota2*3 + nota3*2) / 10;
                    System.out.println("Promedio ponderado: " + promedioPonderado);
                    break;
                case "X":
                    break externa;
                default:
                    System.out.println("no existe el caso " + respuesta + "escriba otro");
                }
            }
        }
    }
}
