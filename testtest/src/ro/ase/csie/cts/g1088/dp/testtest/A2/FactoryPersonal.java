package ro.ase.csie.cts.g1088.dp.testtest.A2;

public class FactoryPersonal {
	public static PersonalSpital getPersonal(TipPersonal tip) {
		PersonalSpital personal = null;
		
		switch(tip) {
		case BRANCARDIER:
			personal = new PersonalBrancardier();
			break;
		case ASISTENT:
			personal = new PersonalAsistent();
			break;
		case MEDIC:
			personal = new PersonalMedic();
			break;
		case RECEPTIONER:
			personal = new PersonalReceptioner();
			break;
		case ANESTEZIST:
			personal = new PersonalAnestezist();
			break;
		case STAGIAR:
			personal = new PersonalStagiar();
			break;
		default:
			throw new UnsupportedOperationException();
		}		
		return personal;
	}
}
