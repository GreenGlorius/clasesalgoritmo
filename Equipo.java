public class Equipo {
	private String nombre;
	private int puntos;
	private int golesFavor;
	private int golesContra;
	
	public Equipo(String nombre, int puntos, int golesFavor, int golesContra) {
		this.setNombre(nombre);
		this.puntos = puntos;
		this.golesFavor = golesFavor;
		this.golesContra = golesContra;
	}
	
	
	public int getPuntos() {
		return puntos;
	}
	
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getGolesFavor() {
		return golesFavor;
	}

	public void setGolesFavor(int golesFavor) {
		this.golesFavor = golesFavor;
	}

	public int getGolesContra() {
		return golesContra;
	}

	public void setGolesContra(int golesContra) {
		this.golesContra = golesContra;
	}
	
	public int diferenciaGoles() {
		return this.golesFavor - this.golesContra;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void mostrarEquipo() {
		System.out.println(this.nombre + " - Pts: " + this.puntos + " | DG: " + this.diferenciaGoles() + " | GF: " + this.golesFavor);
	}
}
