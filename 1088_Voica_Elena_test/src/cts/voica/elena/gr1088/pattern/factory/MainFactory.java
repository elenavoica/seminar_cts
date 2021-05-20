package cts.voica.elena.gr1088.pattern.factory;

public class MainFactory {

	public static void main(String[] args) {
		IClip clip1 = FactoryClip.createClip(TipVideo.TUTORIAL, "ana", 123445);
		IClip clip2 = FactoryClip.createClip(TipVideo.TUTORIAL, "maria", 12344255);
		IClip clip3 = FactoryClip.createClip(TipVideo.LIVE, "dana", 123554);
		IClip clip4 = FactoryClip.createClip(TipVideo.LIVE, "rodi", 1234554);
		
		clip1.start();
		clip2.stop();
		clip3.pause();
		clip4.resume();		
	}
}
