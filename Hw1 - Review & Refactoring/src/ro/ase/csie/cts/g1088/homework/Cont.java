package ro.ase.csie.cts.g1088.homework;


public class Cont implements RataLunara {
	double	valoareImprumut;
	double rata;
	int zileActivareCont;
	int	zileActiv,tip_cont;
	TipCont tipCont;
	
	private Cont(double valoareImprumut, double rata, int zileActivareCont,
			TipCont tipCont) throws Exception {
		if(this.valoareImprumut < 0) 
			throw new Exception();
		else {
			this.valoareImprumut = valoareImprumut;
			this.rata = rata;
			this.zileActivareCont = zileActivareCont;
			this.tipCont = tipCont;
		}
	}
	
	public double getValoareImprumut() {
		return valoareImprumut;
	}
	
	public void setValoareImprumut(double valoareImprumut) throws Exception {
		if(this.valoareImprumut < 0) {
			throw new Exception();
		} else {
			this.valoareImprumut = valoareImprumut;
		}
	}
		
	public double getRata() {
		return rata;
	}
	
	@Override
	public double getRataLunara() {
		return valoareImprumut * rata; 
	}	
	
	@Override
	public String toString() {
		return "{ valoare imprumut: " + valoareImprumut + ", rata: " + rata +
				", zile activare cont: " + zileActivareCont + ", tip cont: " + tipCont + " }";
	}

	public static double calculeazaComisionTotal(Cont[] conturi) {
		double comisionTotal = 0.0; 
		Cont cont;
		for(int i=0; i < conturi.length; i++) {
			cont = conturi[i];
			if(cont.tipCont == TipCont.PREMIUM || cont.tipCont == TipCont.SUPER_PREMIUM) {
				comisionTotal = Banking.calculeazaComision(Banking.brokerFee, cont.valoareImprumut, cont.rata, cont.zileActivareCont);
			}
		}
		return comisionTotal;
	}	
}
