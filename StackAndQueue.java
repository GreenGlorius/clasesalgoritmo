import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {
  public static void main(String[] args) {
    Stack<String> pila = new Stack<>();
    pila.push("1er elemento");
    pila.push("2do elemento");
    pila.push("3er elemento");
    System.out.println(pila.peek());
    String elementoSacado = pila.pop();
    System.out.println(pila.peek());
    System.out.println(elementoSacado);


    Queue<String> fila = new LinkedList<>();
    fila.offer("ian");
    fila.offer("barbi");
    fila.offer("caleb");
    System.out.println(fila.peek());
    String atendido = fila.poll();
    System.out.println(fila.peek());
    System.out.println(atendido);
  }
}
