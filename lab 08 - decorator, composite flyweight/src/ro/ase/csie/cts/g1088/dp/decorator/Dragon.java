package ro.ase.csie.cts.g1088.dp.decorator;

public class Dragon extends Superhero {

	public Dragon(String name, int lifePoints) {
		super(name, lifePoints);
	}

	@Override
	public void runs() {
		System.out.println("flyes to new destination");		
	}

	@Override
	public void isInjured(int lifePoinnts) {
		System.out.println(String.format("%s is injured and loses %d points", this.name, lifePoinnts));
		this.lifePoints -= lifePoinnts;
	}

	@Override
	public void isHealing(int lifePoinnts) {
		System.out.println(String.format("%s is healing and wins %d points", this.name, lifePoinnts));
		this.lifePoints += lifePoinnts;		
	}

}
