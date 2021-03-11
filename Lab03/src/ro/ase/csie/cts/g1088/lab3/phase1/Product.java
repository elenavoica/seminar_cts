package ro.ase.csie.cts.g1088.lab3.phase1;

public class Product {
	public static final int MAX_CLIENT_SENIORITY = 10; 
	public static final float MAX_CLIENT_DISCOUNT = 0.15f;
	
		public float getFinalPrice(ProductType productType, float initialPrice, int clientSeniorityYears)
		  {
		    float finalPrice = 0;
		    float fidelityDiscount = (clientSeniorityYears > MAX_CLIENT_SENIORITY) ? MAX_CLIENT_DISCOUNT : (float)clientSeniorityYears/100; 
		    if (productType == ProductType.NEW)
		    {
		      finalPrice = initialPrice;
		    }
		    else if (productType == ProductType.DISCOUNT)
		    {
		      finalPrice = (initialPrice - (0.1f * initialPrice)) - fidelityDiscount * (initialPrice - (0.1f * initialPrice));
		    }
		    else if (productType == ProductType.LIMITED)
		    {
		      finalPrice = (initialPrice - (0.25f * initialPrice)) - fidelityDiscount * (initialPrice - (0.25f * initialPrice));
		    }
		    else if (productType == ProductType.OLD)
		    {
		      finalPrice = (initialPrice - (0.35f * initialPrice)) - fidelityDiscount * (initialPrice - (0.35f * initialPrice));
		    }
		    return finalPrice;
		  }

}
