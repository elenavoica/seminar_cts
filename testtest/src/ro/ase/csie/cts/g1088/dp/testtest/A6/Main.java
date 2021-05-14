package ro.ase.csie.cts.g1088.dp.testtest.A6;

public class Main {
	public static void main(String[] args) {
		Pacient p = new Pacient("gigi");
		Medic m = new Medic("gabi");
		Salon s =  new Salon();
		
		s.paturi.add(new Pat(false));
		
		FacadeSpital.getVerficare(p, m, s);
	}
}
