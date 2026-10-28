package seccion3;

public class Equipo {
	private String name;
	private int points;
	private int gol;
	private int counterGol;
	
	public Equipo (String name, int points, int gol, int counterGol){
		this.name = name;
		this.points = points;
		this.gol = gol;
		this.counterGol = counterGol;
	}
	public int difference(){
		return this.getGol()-this.getCounterGol();
	}
	public void setName (String name){this.name = name;}
	public String getName(){return name;}
	public void setPoints (int points){this.points = points;}
	public int getpoints(){return points;}
	public void setGol(int gol){this.gol = gol;}
	public int getGol(){return gol;}
	public void setCounterGol (int counterGol){this.counterGol = counterGol;}
	public int getCounterGol(){return counterGol;}
}
