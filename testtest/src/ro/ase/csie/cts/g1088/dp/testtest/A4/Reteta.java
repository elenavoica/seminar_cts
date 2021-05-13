package ro.ase.csie.cts.g1088.dp.testtest.A4;

public class Reteta implements Cloneable {
	String nume;
	int pret;
	
	private Reteta() {}
	
	public Reteta(String nume, int pret) {
		super();
		this.nume = nume;
		this.pret = pret;
	}
	
	@Override
	public String toString() {
		return "Reteta [nume=" + nume + ", pret=" + pret + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Reteta copie = new Reteta();
		copie.nume = this.nume;
		copie.pret = this.pret;
		
		return copie;
	}
}
