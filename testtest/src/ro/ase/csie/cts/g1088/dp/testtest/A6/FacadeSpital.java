package ro.ase.csie.cts.g1088.dp.testtest.A6;

public class FacadeSpital {
	
	public static void getVerficare(Pacient pacient, Medic medic, Salon salon) {
		pacient.verificaGravitatea();
		medic.verificaInternare();
		salon.verificaPat();

	}
}
