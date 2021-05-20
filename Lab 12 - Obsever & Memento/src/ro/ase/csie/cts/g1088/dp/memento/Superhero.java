package ro.ase.csie.cts.g1088.dp.memento;

public class Superhero {
	String name;
	int lifePoints;
	String magic;
	
	public Superhero(String name, int lifePoints, String magic) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
	}
	
	public void attack() {
		System.out.println("attacks");
	}
	
	public void isInjured(int points) {
		this.lifePoints -= points;
	}
	
	public void isHealing(int points) {
		this.lifePoints =+ points;
	}
	
	public MementoHero save() {
		return new MementoHero(name, lifePoints, magic);
	}
	
	public void addSave(MementoHero memento) {
		this.name = memento.name;
		this.lifePoints = memento.lifePoints;
		this.magic = memento.magic;
	}
	
}
