package cts.voica.elena.gr1088.pattern.decorator;

public abstract class DecoratorAbstract extends ClipVideo {
	IClip clip = null;
	int adLength;
	
	
	public DecoratorAbstract(IClip clip, int adLength) {
		this.clip = clip;
		this.adLength = adLength;
	}

	@Override
	public void pause() {
		this.clip.pause();
	}

	@Override
	public void stop() {
		this.clip.stop();
	}

	@Override
	public void resume() {
		this.clip.resume();
	}

	@Override
	public void start() {
		this.clip.start();
	}
	
	public abstract void playAd();

}
