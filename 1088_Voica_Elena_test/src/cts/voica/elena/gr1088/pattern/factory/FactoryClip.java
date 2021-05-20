package cts.voica.elena.gr1088.pattern.factory;

public class FactoryClip {
	
	public static IClip createClip(TipVideo type, String user, long uploadTime) {
		IClip clip = null;
		
		switch(type) {
		case TUTORIAL:
			clip = new ClipTutorial(user, uploadTime);
			break;
		case LIVE:
			clip = new ClipLive(user, uploadTime);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return clip;
	}
}
