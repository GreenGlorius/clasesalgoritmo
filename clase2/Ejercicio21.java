package clase2;

import java.util.Scanner;
/*Crear un array para guardar 5 enteros.  
a.  Inicializar cada elemento 
b.  Mostrar la suma de sus elementos 
c.  Leer un número y decir si está en el array. Hacer una prueba de escritorio. 
d.  Encontrar el número mayor dentro del array 
e.  Calcular el promedio del array */
public class Ejercicio21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = {2,4,6,7,9};
        int suma = 0;
        for(int i = 0; i < numeros.length; i++){
            suma = suma + numeros[i];
        }
        System.out.println("la suma de todos los elementos del array de este ejercicio es: " + suma);
        System.out.println("elige un numero:");
        int numeroElejido = sc.nextInt();
        for(int i = 0; i < numeros.length; i++){
            if(numeroElejido == numeros[i]){
                System.out.println("Si está en el array");
                break;
            }
        }
        int numeroMayor = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeroMayor < numeros[i]){
                numeroMayor = numeros[i];
            }
        }
        System.out.println("el numero mas grande del array es: " + numeroMayor);
        double promedio = suma / numeros.length;
        System.out.println("el promedio es de: " + promedio);
        sc.close();
    }
}