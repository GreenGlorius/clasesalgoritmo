package clase4;
/*10. Función de potencia*: 
a.  Crear una función que utilice Math.pow() para calcular la potencia.  */
public class Ejercicio10 {
    public static int calcularPotencia(int numero, int potencia){
        return  (int) Math.pow(numero, potencia);
    }
    public static void main(String[] args){
        System.out.println(calcularPotencia(10, 2));
    }
}