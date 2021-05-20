package cts.voica.elena.gr1088.pattern.composite;

public class ClipVideo extends ClipAbstract {
	String title;
	long uploadTime;
	int length;
	
	public ClipVideo(String title, long uploadTime, int length) {
		super();
		this.title = title;
		this.uploadTime = uploadTime;
		this.length = length;
	}

	@Override
	public void pause() {
		System.out.println(title + ": pause video");		
	}

	@Override
	public void stop() {
		System.out.println(title + ": stop video");		
	}

	@Override
	public void resume() {
		System.out.println(title + ": resume video");		
	}

	@Override
	public void start() {
		System.out.println(title + ": start video");		
	}

	@Override
	public void addClip(IClip clip) {
	}

}
