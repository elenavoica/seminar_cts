package ro.ase.csie.cts.g1088.dp.testtest.A1;

public class Pacient {
	private boolean patRabatabil;
	private boolean micDejunInclus;
	private boolean papuci;
	private boolean halatInterior;
	
	private Pacient() {}
	
	
	
	@Override
	public String toString() {
		return "Pacient [patRabatabil=" + patRabatabil + ", micDejunInclus=" + micDejunInclus + ", papuci=" + papuci
				+ ", halatInterior=" + halatInterior + "]";
	}


	public static class PacientBuilder {
		Pacient pacient = null;
		
		public PacientBuilder() {
			pacient = new Pacient();
		}
		
		public PacientBuilder patRabatabil() {
			this.pacient.patRabatabil = true;
			return this;
		}
		
		public PacientBuilder micDejunInclus() {
			this.pacient.micDejunInclus = true;
			return this;
		}
		
		public PacientBuilder papuci() {
			this.pacient.papuci = true;
			return this;
		}
		
		public PacientBuilder halatInterior() {
			this.pacient.halatInterior = true;
			return this;
		}
		
		public Pacient build() {
			return pacient;
		}
	}
	
}
