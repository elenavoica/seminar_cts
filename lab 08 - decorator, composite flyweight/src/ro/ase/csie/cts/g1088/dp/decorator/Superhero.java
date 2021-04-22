package ro.ase.csie.cts.g1088.dp.decorator;

public abstract class Superhero {
	String name;
	int lifePoints;
	public Superhero(String name, int lifePoints) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
	}
	
	public abstract void runs();
	public abstract void isInjured(int lifePoinnts);
	public abstract void isHealing(int lifePoinnts);
	
}
