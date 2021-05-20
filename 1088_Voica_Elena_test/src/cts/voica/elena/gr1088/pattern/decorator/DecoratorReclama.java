package cts.voica.elena.gr1088.pattern.decorator;

public class DecoratorReclama extends DecoratorAbstract {

	public DecoratorReclama(IClip clip, int adLength) {
		super(clip, adLength);
	}

	@Override
	public void playAd() {
		System.out.println("an ad is playing");
	}
	

	@Override
	public void start() {
		playAd();
		this.clip.start();
	}

}
