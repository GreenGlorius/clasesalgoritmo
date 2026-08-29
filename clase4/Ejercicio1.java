package clase4;
/*1.  Primera función*: 
a.  Crear una función llamada saludar() que muestre por consola un mensaje de 
bienvenida. 
b.  Luego modificarla para que reciba como parámetro el nombre de una persona: */
public class Ejercicio1 {
    public static void main (String[] args){
        saludar();
        saludar("Ian");
    }
    
    public static void saludar(){
        System.out.println("Bienvenido");
    }

    public static void saludar(String nombre){
        System.out.println("Bienvenido " + nombre);
    }
}
