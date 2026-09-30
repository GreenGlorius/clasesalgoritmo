package clase5;
/*Crear una clase Jugador para representar a un jugador de un videojuego.
a. La clase deberá tener:
i. Nombre
ii. Nivel
iii. Puntos
b. Crear la clase y sus propiedades.
c. Crear un método ganarPuntos(int cantidad) que incremente los puntos del
jugador.
d. Crear un método subirNivel() que incremente el nivel del jugador.
e. Crear dos objetos Jugador con diferentes valores.
f. Simular algunas acciones sobre los jugadores y mostrar su estado final. */
public class Jugador {
    private String nombre;
    private int nivel;
    private int puntos;

    public Jugador(){}

    public Jugador(String nombre){
        this.nombre = nombre;
        this.nivel = 0;
        this.puntos = 0;
    }
    public String getNombre(){
        return nombre;
    }
    public int getNivel(){
        return nivel;
    }
    public int getPuntos(){
        return puntos;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    public void ganarPuntos(int puntos){
        this.puntos += puntos;
    }
    public void subirNivel(){
        this.nivel += 1;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + this.getNombre() + " | Nivel: " + this.getNivel() + " | Puntos: " + this.getPuntos());
    }
    public static void main(String[] args){
        Jugador jugador1 = new Jugador("Barbi");
        Jugador jugador2 = new Jugador("Ian");
        jugador1.ganarPuntos(300);
        jugador2.ganarPuntos(400);
        jugador1.subirNivel();
        jugador2.subirNivel();
        jugador1.mostrarDatos();
        jugador2.mostrarDatos();

    }
}
