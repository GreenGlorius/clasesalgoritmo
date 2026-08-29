package clase4;
/*9.  Casting en funciones: 
a.  Crear una función que retorne el promedio de tres números enteros 
double calcularPromedio(int a, int b, int c) 
b.  Luego probar las siguientes dos alternativas 
return (double)(a + b + c) / 3; 
 
return (double)((a + b + c) / 3); 
c.  Explicar  mediante  una  prueba  de  escritorio  por  qué  se  producen  resultados 
diferentes. porque en el primer caso al dividirse se convierte en double antes. en el segundo los enteros se dividen dentro del parentesis quedando x y al conventirse luego en double solo le queda x,0*/

public class Ejercicio9{
    public static double calcularPromedio(int a, int b, int c){
        return (double)(a + b + c)/3;
    }
    public static double calcularPromedio2(int a, int b, int c){
        return (double)((a + b + c)/3);
    }
    public static void main(String[] args){
        System.out.println(calcularPromedio(2,4,5));
        System.out.println(calcularPromedio2(2,4,5));
    }
}