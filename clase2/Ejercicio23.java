package clase2;

import java.util.ArrayList;
import java.util.Arrays;
/*Crear una variable String llamada nombreAnimales, con el nombre de 5 animales. 
a.  Mostrar en la consola el nombre de cada uno de los animales 
b.  Transformar la variable nombreAnimales en un Array de Strings y mostrar por 
consola 
c.  Crear  un  ArrayList  con  los  elementos  del String  (nombreAnimales).  Leer  los 
elementos uno a uno y mostrar por consola 
d.  ¿En qué casos se debería usar Array y en qué casos ArrayList?  */
public class Ejercicio23 {
	public static void main(String[] args) {
        String nombreAnimales = "gato,perro,vaca,caballo,pez";
        String[] animales = nombreAnimales.split(",");
        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i]);
        }
        ArrayList<String> listaAnimales = new ArrayList<>(Arrays.asList(animales));
        for (String a : listaAnimales) {
            System.out.println(a);
        }
	}
}