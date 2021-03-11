package ro.ase.csie.cts.g1088.lab3.phase1;

public enum ProductType {
	NEW(0), DISCOUNT(0.1f), LIMITED(0.5f), OLD(0.35f);
	
	private final float discount;
	
	private ProductType(float discount) {
		this.discount = discount;
	}
	
	public float getDiscount() {
		return this.discount;
	}

}
