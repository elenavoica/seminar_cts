package ro.ase.csie.cts.g1088.dp.testtest.A2;

public class Main {

	public static void main(String[] args) {
		PersonalSpital personal = FactoryPersonal.getPersonal(TipPersonal.BRANCARDIER);
		PersonalSpital personal2 = FactoryPersonal.getPersonal(TipPersonal.ASISTENT);
		PersonalSpital personal3 = FactoryPersonal.getPersonal(TipPersonal.MEDIC);
		PersonalSpital personal4 = FactoryPersonal.getPersonal(TipPersonal.RECEPTIONER);
		PersonalSpital personal5 = FactoryPersonal.getPersonal(TipPersonal.ANESTEZIST);
		PersonalSpital personal6 = FactoryPersonal.getPersonal(TipPersonal.STAGIAR);

		personal.munceste();
		personal2.munceste();
		personal3.munceste();
		personal4.munceste();
		personal5.munceste();
		personal6.munceste();
	}

}
