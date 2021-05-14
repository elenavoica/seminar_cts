package ro.ase.csie.cts.g1088.dp.testtest.A5;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<MedicamentFarmacie> medicamente = new ArrayList<>();
		//medicamente.add()
		ArrayList<InterfataMedicament> medicamenteSpeciale = new ArrayList<>();
		medicamenteSpeciale.add(new MedicamentSpital(true, "algocalmin"));

		
		InterfataMedicament medicament = new MedicamentSpital(true, "paracetamol");
		AdapterMedicament adapter = new AdapterMedicament(medicament);
		medicamente.add(adapter);
		
		for(MedicamentFarmacie medicament2 : medicamente) {
			medicament2.cumparaMedicament();
		}
	}

}
