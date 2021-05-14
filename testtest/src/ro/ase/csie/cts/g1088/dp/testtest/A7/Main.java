package ro.ase.csie.cts.g1088.dp.testtest.A7;

public class Main {

	public static void main(String[] args) {
		Rezultat analiza = new Analize("mimi", 100);
		//analiza.refacereAnalize();
		analiza.rezultateAnalize();
		
		Rezultat analiza2 = new Analize("cici", 50);
		//analiza2.refacereAnalize();
		//analiza2.rezultateAnalize();
		
		analiza = new DecoratorOnline(analiza);
		analiza.rezultateAnalize();
	}

}
