package ro.ase.csie.cts.g1088.dp.testtest.A7;

public abstract class DecoratorAbstract extends Rezultat{
	
	Rezultat rezultat = null;

	public DecoratorAbstract(Rezultat rezultat) {
		super(rezultat.nume, rezultat.pret);
		this.rezultat = rezultat;		
	}
	
	@Override
	public int getPret() {
		return this.rezultat.pret;
	}

	@Override
	public void refacereAnalize() {
		this.rezultat.refacereAnalize();
	}

}
