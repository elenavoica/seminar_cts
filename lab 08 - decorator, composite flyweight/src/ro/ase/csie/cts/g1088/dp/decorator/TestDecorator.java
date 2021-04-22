package ro.ase.csie.cts.g1088.dp.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		
		Dragon dragon = new Dragon("Blue dragon", 1000);
		dragon.runs();
		dragon.isInjured(200);
		dragon.isHealing(100);
	}

}
