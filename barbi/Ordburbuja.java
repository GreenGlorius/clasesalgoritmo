package barbi;

import java.util.ArrayList;

 public class Ordburbuja{
    public static ArrayList<Integer> ordenBurbuja(ArrayList<Integer> lista){
        for(int i = 0; i < lista.size()-1; i++)
            for(int j = i + 1; j < lista.size(); j++)
                if(lista.get(i) > lista.get(j))
                    swap(lista, i, j);
        return lista;
    }
    
    public static void swap (ArrayList<Integer> lista, int i, int j){
        Integer aux = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, aux);
    }

    
    public static void main (String [] args){
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(3);
        lista.add(2);
        lista.add(5);
        lista.add(4);
        for(Integer n: lista)System.out.println(n);
        ArrayList<Integer> listaOrdenada = ordenBurbuja(lista);
        for(Integer n: listaOrdenada)System.out.println(n);
    }
 }