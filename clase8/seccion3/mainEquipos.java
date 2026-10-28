package seccion3;

import java.util.List;
import java.util.ArrayList;

public class mainEquipos {
	public static void main(String[] args){
		List<Equipo> equipos = new ArrayList<>();
		equipos.add(new Equipo("Boca", 12, 10, 4));
		equipos.add(new Equipo("River", 12, 8, 3));
		equipos.add(new Equipo("Raciong", 10, 7, 6));
		equipos.add(new Equipo("Independiente", 12, 10, 5));
		equipos.add(new Equipo("San Lorenzo", 9, 6, 6));
		
	}
}
