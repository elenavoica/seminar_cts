package ro.ase.csie.cts.g1088.dp.testtest.A1;

public class Main {

	public static void main(String[] args) {
		Pacient pacientSimplu = new Pacient.PacientBuilder().build();
		Pacient pacientExtra = new Pacient.PacientBuilder().patRabatabil()
				.micDejunInclus()
				.papuci()
				.halatInterior()
				.build();
		
		System.out.println(pacientSimplu);
		System.out.println(pacientExtra);
	}
	
}
