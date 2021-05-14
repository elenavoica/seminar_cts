package ro.ase.csie.cts.g1088.dp.testtest.A7;

public class Analize extends Rezultat {

	public Analize(String nume, int pret) {
		super(nume, pret);
	}

	@Override
	public int getPret() {
		return this.pret;
	}

	@Override
	public void refacereAnalize() {
		System.out.println("vino maine iar");
	}

	@Override
	public void rezultateAnalize() {
		System.out.println("online/printed");
	}

}
