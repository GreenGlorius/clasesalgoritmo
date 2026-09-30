package clase6;

public class Nodo {
	public String valor;
	public Nodo seguiente;
	
	public Nodo() {
		this.valor="";
		this.seguiente=null;
	}
	public Nodo(String texto) {
		this.valor=texto;
		this.seguiente=null;
	}
		
	/**
	 * Esta funcion agrega um nodo en la posicion seguiente a el nodo pasado como parámetro
	 * @param nodo
	 * @param newNodo
	 */
	public void addNodo(Nodo nodo, Nodo newNodo) {
		newNodo.seguiente = nodo.seguiente;
		nodo.seguiente = newNodo;		
	}
	
	/**
	 * Esta funcion agrega um nodo en la posicion seguiente al nodo atual
	 * @param nodo
	 * @param newNodo
	 */
	public void addNodo(Nodo newNodo) {
		newNodo.seguiente = this.seguiente;
		this.seguiente = newNodo;		
	}
		
	
	/**
	 * Esta funcion borra un nodo, se la pasa el nodo anterior al que se quiere borrar
	 * @param nodo
	 * @param newNodo
	 */
	public void delNodo(Nodo nodoAnterior) {		
		//al poner en null lo marcamos para el garbaje colector
		Nodo obsoletoNode = nodoAnterior.seguiente;
		nodoAnterior.seguiente = obsoletoNode.seguiente;
		obsoletoNode=null; //al poner en null lo "marcamos" para el GC				
	}	
	
	public static void main(String[] args) {
		
		Nodo raiz = new Nodo("H");
		
		Nodo nodoG = new Nodo("G");
		raiz.addNodo(nodoG);
		
		Nodo nodoF = new Nodo("F");
		nodoG.addNodo(nodoF);
		
		Nodo nodoE = new Nodo("E");
		nodoF.addNodo(nodoE);
		
		Nodo nodoD = new Nodo("D");
		nodoE.addNodo(nodoD);
		
		Nodo nodoC = new Nodo("C");
		nodoD.addNodo(nodoC);
		
		Nodo nodoB = new Nodo("B");
		nodoC.addNodo(nodoB);
		
		Nodo nodoA = new Nodo("A");
		nodoB.addNodo(nodoA);
		
		nodoA.seguiente=null;
		
		printLista(raiz);
		
		//inverter la lista para que se imprima en orden crescente
		raiz = inverterLista(raiz);
		
		printLista(raiz);
	}
	
	/**
	 * Funcion que imprime los valores de los nodos
	 * @param nodo
	 */
	private static void printLista(Nodo nodo) {
		Nodo nodoActual=nodo;
		String texto = "";
		
		while(nodoActual!=null) {
			texto += nodoActual.valor + " ";
			nodoActual=nodoActual.seguiente;
		}
		
		System.out.println(texto);		
	}
	
	/**
	 * Función para inverter la lista los valores de los nodos
	 * @param nodo
	 */
	private static Nodo inverterLista(Nodo raiz) {
		return null;
	}
}	