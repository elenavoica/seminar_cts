package ro.ase.csie.cts.g1088.homework;

public class Banking {
	public static final float brokerFee = (float) 0.25;
	public static final int zileAn = 365;
	
	public static double calculeazaComision(float brokerFee, double valoareImprumut,
			double rata, int zileActivareCont) {
		return brokerFee * valoareImprumut * Math.pow(rata, (zileActivareCont / zileAn)) - valoareImprumut;
	}
}
