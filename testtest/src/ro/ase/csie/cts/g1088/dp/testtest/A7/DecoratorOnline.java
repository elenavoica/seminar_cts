package ro.ase.csie.cts.g1088.dp.testtest.A7;

public class DecoratorOnline extends DecoratorAbstract {

	public DecoratorOnline(Rezultat rezultat) {
		super(rezultat);
	}

	@Override
	public void rezultateAnalize() {
		System.out.println("online");
	}

}
