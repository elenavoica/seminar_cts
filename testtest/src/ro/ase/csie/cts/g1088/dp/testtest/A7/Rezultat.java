package ro.ase.csie.cts.g1088.dp.testtest.A7;

public abstract class Rezultat {
	String nume;
	int pret;
	public Rezultat(String nume, int pret) {
		super();
		this.nume = nume;
		this.pret = pret;
	}
	
	public abstract int getPret();
	public abstract void refacereAnalize();
	public abstract void rezultateAnalize();
}
