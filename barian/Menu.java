package barian;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    private String nombre;
    private TipoMenu tipo;
    private List<String> opciones;
    /*PARA CREAR UN MENÚ primero agrego en el Tipo Menu
    el nombre, despues en Menu agrego ese nombre y le pongo su logica */
    public enum TipoMenu {
        INICIO,
        LOGIN,
        REGISTER
    }
    public Menu(String nombre, TipoMenu tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        this.opciones = new ArrayList<>();
        cargarOpciones();
    }

    private void cargarOpciones(){
        opciones.clear();

        switch (tipo) {
            case INICIO:
                opciones.add("Iniciar Sesion");
                opciones.add("Registrarse");
                opciones.add("Cerrar Juego");
                break;
            case LOGIN:
                opciones.add("Ingresar");
                opciones.add("Volver al menu inicial");
                break;
            case REGISTER:
                opciones.add("Crear usuario");
                opciones.add("Volver al menu inicial");
                break;
        }
    }

    public void iniciarSesion(Scanner sc, ArrayList<Jugador> jugadores) {
        System.out.print("Nombre de jugador: ");
        String nombre = sc.nextLine().trim();
        System.out.print("Clave: ");
        String clave = sc.nextLine();

        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre)
                    && jugador.getClave().equals(clave)) {
                System.out.println("Bienvenido/a " + jugador.getNombre());
                mostrarDatosJugador(jugador);
                return;
            }
        }

        System.out.println("Nombre de jugador o clave incorrectos.");
    }

    private void mostrarDatosJugador(Jugador jugador) {
        System.out.println("Vida: " + jugador.getVida());
        System.out.println("Armadura: " + jugador.getArmadura());
        System.out.println("Ataque: " + jugador.getAtaque());
        System.out.println("Suerte: " + jugador.getSuerte());
        System.out.println("Magia: " + jugador.getMagia());
        System.out.println("Mana: " + jugador.getMana());
        System.out.println("Monedas: " + jugador.getMonedas());
        System.out.println("Experiencia: " + jugador.getExp());
        System.out.println("Nivel: " + jugador.getNivel());
    }

        public void mostrar() {
        System.out.println("\n===== " + nombre + " =====");
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println((i + 1) + ". " + opciones.get(i));
        }
        System.out.print("Seleccione una opcion: ");
    }
}
