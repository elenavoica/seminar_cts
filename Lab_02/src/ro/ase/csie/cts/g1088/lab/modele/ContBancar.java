package ro.ase.csie.cts.g1088.lab.modele;

public abstract class ContBancar extends Cont {
	protected double balanta;
	protected String iban;
	
	public ContBancar(double balanta, String iban) {
		this.balanta = balanta;
		this.iban = iban;
	}
	
	//generate getBalanta to avoid errors 
	//you can write it yourself too using @Override
 	
	@Override
	public double getBalanta() {
		return this.balanta;
	}
}
