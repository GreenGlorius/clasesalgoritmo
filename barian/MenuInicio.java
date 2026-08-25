package barian;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuInicio extends Menu {
    public MenuInicio() {
        super("Barian", TipoMenu.INICIO);
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
}
