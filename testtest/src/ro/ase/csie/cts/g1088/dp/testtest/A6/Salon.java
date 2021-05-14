package ro.ase.csie.cts.g1088.dp.testtest.A6;

import java.util.ArrayList;
import java.util.List;

public class Salon {
	
	List<Pat> paturi = new ArrayList<>();

	public Salon(List<Pat> paturi) {
		super();
		this.paturi = paturi;
	}
	
	public Salon() {}
	
	public void verificaPat() {
		for(Pat pat : paturi) {
			if(pat.esteLiber == true) {
				System.out.println("da i pat");
			} else {
				System.out.println("ups");
			}
		}
	}
 }
