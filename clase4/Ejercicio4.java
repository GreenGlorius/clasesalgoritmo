package clase4;
/*4.  Funciones sobre arrays*: 
a.  Crear  una  función  llamada  calcular  suma,  que  reciba  un  array  de  enteros  y 
retorne la suma de sus elementos 
calcularSuma(int[] numeros) 
  
b.  Desde main: 
i.  Crear un array 
ii.  Mostrar sus elementos 
iii.  Llamar a la función 
iv.  Mostrar el resultado 
c.  Luego,  crear  otra  funcion  llamada  calcularPromedio,  que  reciba  un  array  de 
enteros y devuelva el promedio de sus elementos. Probarla de la misma manera 
que la función calcularSuma.  */
public class Ejercicio4 {
    public static int calcularSuma(int[] numeros){
        int suma = 0;
        for(int i = 0; i< numeros.length; i++){
            suma += numeros[i];
        }
        return suma;
    }
    public static double calcularPromedio(int suma, int cantidad){
        return suma / cantidad;
    }
    public static void main(String[] args){
        int[] numeros = {1,3,6,7,8};
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        System.out.println(calcularSuma(numeros));
        System.out.println(calcularPromedio(calcularSuma(numeros), numeros.length));
    }
}
