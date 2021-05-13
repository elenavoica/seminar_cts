package ro.ase.csie.cts.g1088.dp.testtest.A2;

public class Main {

	public static void main(String[] args) {
		PersonalSpital personal = FactoryPersonal.getPersonal(TipPersonal.BRANCARDIER);
		PersonalSpital personal2 = FactoryPersonal.getPersonal(TipPersonal.ASISTENT);
		PersonalSpital personal3 = FactoryPersonal.getPersonal(TipPersonal.MEDIC);
		
		personal.munceste();
		personal2.munceste();
		personal3.munceste();
	}

}
