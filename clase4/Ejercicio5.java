package clase4;

import java.util.Scanner;

/*Reutilizar funciones: 
a.  Tomar el ejercicio 7 de la Lista Nº 3 que solicita obtener distintas estadísticas de 
un array. Refactorizarlo creando funciones para: 
i.  calcular suma; 
ii.  calcular promedio; 
iii.  obtener mayor; 
iv.  obtener menor; 
v.  contar positivos; 
vi.  contar negativos. 
b.  El programa principal deberá utilizar estas funciones para mostrar los 
resultados. */
public class Ejercicio5 {
    public static int calcularSuma(int[] numeros){
        int suma = 0;
        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        return suma;
    }

    public static double calcularPromedio(int suma, int cantidad){
        return suma / cantidad;
    }

    public static int getMayor(int[] numeros){
        int mayor = numeros[0];
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        return mayor;
    }

    public static int getMayorPos(int[] numeros){
        int mayor = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > numeros[mayor]){
                mayor = i;
            }
        }
        return mayor;
    }

    public static int getMenor(int[] numeros){
        int menor = numeros[0];
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        return menor;
    }

    public static int getMenorPos(int[] numeros){
        int menor = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < numeros[menor]){
                menor = i;
            }
        }
        return menor;
    }

    public static double calcularPromedio(int[] numeros){
        int suma = 0;
        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        return suma / numeros.length;
    }

    public static int contarPositivos(int[] numeros){
        int positivos = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > 0){
                positivos += numeros[i];
            }
        }
        return positivos;
    }

    public static int contarNegativos(int[] numeros){
        int negativos = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < 0){
                negativos += numeros[i];
            }
        }
        return negativos;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Escriba 10 numeros");
        for(int i = 0; i < numeros.length;i++){
            int numero = sc.nextInt();
            numeros[i] = numero;
        }
        System.out.println("la suma de todos los numeros da = "+ calcularSuma(numeros) );
        System.out.println("El promedio es de: "+ calcularPromedio(numeros) );
        System.out.println("hay" + contarPositivos(numeros) + " positivos, y hay " + contarNegativos(numeros) + " negativos");
        System.out.println("El numero mayor es: " + getMayor(numeros) + " y su posición es la "+ getMayorPos(numeros));
        System.out.println("El numero menor es: " + getMenor(numeros) + " y su posición es la " + getMenorPos(numeros));
        sc.close();
    }
}
