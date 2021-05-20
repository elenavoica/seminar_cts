package cts.voica.elena.gr1088.pattern.decorator;

public class ClipVideo implements IClip {
	
	String user;
	long uploadTime;
		
	public ClipVideo(String user, long uploadTime) {
		super();
		this.user = user;
		this.uploadTime = uploadTime;
	}
	
	public ClipVideo() {
	}

	@Override
	public void pause() {
		System.out.println(user + ": clip paused");		
	}

	@Override
	public void stop() {
		System.out.println(user + ": clip stopped");		
	}

	@Override
	public void resume() {
		System.out.println(user + ": clip resumed");		
	}

	@Override
	public void start() {
		System.out.println(user + ": clip started");		
	}

}
