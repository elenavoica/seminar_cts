package ro.ase.csie.cts.g1088.lab3.phase2;

import ro.ase.csie.cts.g1088.lab3.exceptii.ClientSeniorityException;
import ro.ase.csie.cts.g1088.lab3.exceptii.InvalidPriceException;

public class Product {
	public static final int MAX_CLIENT_SENIORITY = 10; 
	public static final float MAX_CLIENT_DISCOUNT = 0.15f;
	
	public static void priceValidation(float initialPrice) throws InvalidPriceException {
		if(initialPrice <= 0) {
			throw new InvalidPriceException();
		}
	}
	
	public static void seniorityValidation(int clientSeniorityYears) throws ClientSeniorityException {
		if(clientSeniorityYears < 0) {
			throw new ClientSeniorityException();
			}
	}
		
		public static float getFidelityDiscount(int clientSeniorityYears) {
			return (clientSeniorityYears > MAX_CLIENT_SENIORITY) ? MAX_CLIENT_DISCOUNT : (float)clientSeniorityYears/100;
		}
		
		public static float getDiscountedPrice(float initialPrice, float discount) {
			return initialPrice - (discount * initialPrice);
		}
	
		public float getFinalPrice(ProductType productType, float initialPrice, int clientSeniorityYears) throws InvalidPriceException, ClientSeniorityException
		  {
			priceValidation(initialPrice);
			seniorityValidation(clientSeniorityYears);
			
		    float finalPrice = 0;
		    float fidelityDiscount = getFidelityDiscount(clientSeniorityYears);
		    float discount = ProductType.NEW.getDiscount(); 
		    float productTypeDiscountValue = 0;
		    
		    switch(productType) {
		    case NEW:
		    	finalPrice = initialPrice;
		    	break;
		    case DISCOUNT: 
		    	discount = ProductType.DISCOUNT.getDiscount();
		    	productTypeDiscountValue = getDiscountedPrice(initialPrice, productTypeDiscountValue);
			    finalPrice = productTypeDiscountValue *(1- fidelityDiscount);
		    case LIMITED:
		    	discount = ProductType.LIMITED.getDiscount();
		    	productTypeDiscountValue = getDiscountedPrice(initialPrice, productTypeDiscountValue);
			    finalPrice = productTypeDiscountValue *(1- fidelityDiscount);
			    break;
		    case OLD:
		    	discount = ProductType.OLD.getDiscount();
		    	productTypeDiscountValue = getDiscountedPrice(initialPrice, productTypeDiscountValue);
			    finalPrice = productTypeDiscountValue *(1- fidelityDiscount);
		    	break;
		    default:
		    	throw new UnsupportedOperationException("a symbol from enum is not processed");
		    }
		    return finalPrice;
		  }

}
