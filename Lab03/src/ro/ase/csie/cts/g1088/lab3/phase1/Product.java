package ro.ase.csie.cts.g1088.lab3.phase1;

import ro.ase.csie.cts.g1088.lab3.exceptii.ClientSeniorityException;
import ro.ase.csie.cts.g1088.lab3.exceptii.InvalidPriceException;

public class Product {
	public static final int MAX_CLIENT_SENIORITY = 10; 
	public static final float MAX_CLIENT_DISCOUNT = 0.15f;
	
		public float getFinalPrice(ProductType productType, float initialPrice, int clientSeniorityYears) throws InvalidPriceException, ClientSeniorityException
		  {
			if(initialPrice <= 0) {
				throw new InvalidPriceException();
			}
			
			if(clientSeniorityYears < 0) {
				throw new ClientSeniorityException();
			}
			
		    float finalPrice = 0;
		    float fidelityDiscount = (clientSeniorityYears > MAX_CLIENT_SENIORITY) ? MAX_CLIENT_DISCOUNT : (float)clientSeniorityYears/100; 
		    float discount = ProductType.NEW.getDiscount(); 
		    
		    switch(productType) {
		    case NEW:
		    	finalPrice = initialPrice;
		    	break;
		    case DISCOUNT: 
		    	discount = ProductType.DISCOUNT.getDiscount();
			    finalPrice = (initialPrice - (discount * initialPrice)) - fidelityDiscount * (initialPrice - (discount * initialPrice));
			     break;
		    case LIMITED:
		    	discount = ProductType.LIMITED.getDiscount();
			    finalPrice = (initialPrice - (discount * initialPrice)) - fidelityDiscount * (initialPrice - (discount * initialPrice));
			    break;
		    case OLD:
		    	discount = ProductType.OLD.getDiscount();
			    finalPrice = (initialPrice - (discount * initialPrice)) - fidelityDiscount * (initialPrice - (discount * initialPrice));
		    	break;
		    default:
		    	throw new UnsupportedOperationException("a symbol from enum is not processed");
		    }
		    return finalPrice;
		  }

}
