package clase3;

import java.util.Scanner;

/*12. Solicitar al usuario 5 palabras y almacenarlas en un array. 
a. Mostrar todas las palabras. 
b. Mostrar la palabra más larga. 
c. Mostrar la palabra más corta. 
d. Indicar cuántas palabras tienen más de 5 caracteres. */
public class Ejercicio12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] palabras = new String[5];
        for(int i = 0; i < palabras.length; i++){
            System.out.println("le quedan por ingresar " + (palabras.length - i) + " palabras");
            palabras[i] = sc.next();
        }
        // a. Mostrar todas las palabras
        System.out.println("a. Palabras ingresadas:");
        for(int i = 0; i < palabras.length; i++){
            System.out.print(palabras[i]);
            if(i < palabras.length - 1) System.out.print(", ");
        }
        System.out.println();
        
        // b. Mostrar la palabra más larga
        String palabraMasLarga = palabras[0];
        String palabraMasLargaUnica = palabras[0];
        for(int i = 1; i < palabras.length; i++){
            if(palabraMasLargaUnica.length() == palabras[i].length()){
              palabraMasLarga = palabraMasLarga + ", " + palabras[i];
              palabraMasLargaUnica = palabras[i];
            }else if(palabraMasLargaUnica.length() < palabras[i].length()){
                palabraMasLarga = palabras[i];
                palabraMasLargaUnica = palabras[i];
            }
        }
        System.out.println("b. Palabra más larga: " + palabraMasLarga);
        
        // c. Mostrar la palabra más corta
        String palabraMasCorta = palabras[0];
        String palabraMasCortaUnica = palabras[0];
        for(int i = 1; i < palabras.length; i++){
            if(palabraMasCortaUnica.length() == palabras[i].length()){
              palabraMasCorta = palabraMasCorta + ", " + palabras[i];
              palabraMasCortaUnica = palabras[i];
            }else if(palabraMasCortaUnica.length() > palabras[i].length()){
                palabraMasCorta = palabras[i];
                palabraMasCortaUnica = palabras[i];
            }
        }
        System.out.println("c. Palabra más corta: " + palabraMasCorta);
        
        // d. Contar palabras con más de 5 caracteres
        int contador = 0;
        for(int i = 0; i < palabras.length; i++){
            if(palabras[i].length() > 5){
                contador++;
            }
        }
        System.out.println("d. Palabras con más de 5 caracteres: " + contador);
        
        sc.close();
    }
}
