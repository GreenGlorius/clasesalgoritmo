package clase2;

import java.util.Scanner;
/*. (Adaptación del problema de la lista de ejercicios de la anterior semana) Se necesita un 
programa para mostrar el tipo de un triángulo a partir de la longitud de sus tres lados. El 
usuario deberá poder repetir la consulta las veces que necesite presionando Enter luego 
de un resultado, o bien, terminar el programa escribiendo cualquier texto para salir. Leer 
la  longitud  de  los  3  lados  de  un  triángulo.  A  partir  dichos  lados  y  de  la  siguiente 
información, mostrar qué tipo de triángulo es: 
a.  Escaleno: todos los lados distintos 
b.  Equilátero: todo los lados iguales 
c.  Isósceles: solo 2 lados iguales  */
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        while(true){
            System.out.println("Dime la longitud de los 3 lados de un triangulo y te dire que tipo de triangulo es");
            double lado1 = sc.nextDouble();
            double lado2 = sc.nextDouble();
            double lado3 = sc.nextDouble();
            sc.nextLine(); 
            if(lado1 == lado2 && lado1 == lado3) {
                System.out.println("su triangulo es equilatero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("su triangulo es isoseles");
            }else {
                System.out.println("su triangulo es escaleno");
            }
            System.out.println("si quiere continuar solo presione enter, sino escriba cualquier cosa");
            respuesta = sc.nextLine(); 
            if(!respuesta.isEmpty()){ 
                break;
            }
        }
        sc.close();
        
    }
}
