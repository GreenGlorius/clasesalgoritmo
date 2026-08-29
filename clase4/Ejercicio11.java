package clase4;
/*11. Factorial recursivo*: 
a.  Crear una función que calcule el factorial de un número utilizando recursividad: 
int factorial(int n) 
 
b.  Por ejemplo, analizar: 
factorial(5) → 120 
 
5 × factorial(4) 
4 × factorial(3) 
3 × factorial(2) 
2 × factorial(1) 
1 
 
c.  Identificar el caso base y el caso recursivo  */
public class Ejercicio11 {
    public static int calcularFactorial(int n){
        if(n == 1){
            return 1;
        }
        return n *calcularFactorial(n-1);
    }
    public static void main(String[] args){
        System.out.println(calcularFactorial(5));
    }
}