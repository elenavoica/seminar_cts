package ro.ase.csie.cts.g1088.dp.testtest.A5;

public class MedicamentSpital implements InterfataMedicament{
	private boolean reteta;
	private String nume;
	
	

	public MedicamentSpital(boolean reteta, String nume) {
		super();
		this.reteta = reteta;
		this.nume = nume;
	}



	@Override
	public void achizitioneazaMedicament() {
		prezintaReteta();
	}
	
	public void prezintaReteta() {
		if(reteta == true) {
			System.out.println("da i medicamentul");
		} else {
			System.out.println("altadata");
		}
	}



	@Override
	public String toString() {
		return "MedicamentSpital [reteta=" + reteta + ", nume=" + nume + "]";
	}
	
	

}
