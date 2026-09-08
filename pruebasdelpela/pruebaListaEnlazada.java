package pruebasdelpela;

public class pruebaListaEnlazada {
        static class Nodo {
        String value;
        Nodo next;

        public Nodo(String value) {
            this.value = value;
            this.next = null;
        }

        public static void addNodo(){
            
        }
        
    }
    private static Nodo personas;
    public static void main(String[] args){
        personas = new Nodo("Ian");
        personas.next = new Nodo("Barbi");
        personas.next.next = new Nodo("Bianca");
        personas.next.next.next = new Nodo("Evan");
    }
}

