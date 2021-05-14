package ro.ase.csie.cts.g1088.dp.testtest.A5;

public class AdapterMedicament extends MedicamentFarmacie {
	
	InterfataMedicament medicament;
	
	public AdapterMedicament(InterfataMedicament medicament) {
		super();
		this.medicament = medicament;
	}

	@Override
	public void cumparaMedicament() {
		medicament.achizitioneazaMedicament();
	}
	
}
