package ro.ase.csie.cts.g1088.dp.memento;

import java.util.Date;

public class MementoHero {
	String name;
	int lifePoints;
	String magic;
	
	Date saveDate;

	public MementoHero(String name, int lifePoints, String magic) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
		this.saveDate = new Date();
	}
	
	
}
