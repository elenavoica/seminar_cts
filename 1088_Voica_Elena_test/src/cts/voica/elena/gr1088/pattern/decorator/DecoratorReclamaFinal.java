package cts.voica.elena.gr1088.pattern.decorator;

public class DecoratorReclamaFinal extends DecoratorAbstract {

	public DecoratorReclamaFinal(IClip clip, int adLength) {
		super(clip, adLength);
	}

	@Override
	public void playAd() {
		System.out.println("an ad is playing at the end of the video");
	}
	
	@Override
	public void stop() {
		this.clip.stop();
		playAd();
	}

}
