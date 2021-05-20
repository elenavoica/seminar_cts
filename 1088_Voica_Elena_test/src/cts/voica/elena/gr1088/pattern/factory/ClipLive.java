package cts.voica.elena.gr1088.pattern.factory;

public class ClipLive implements IClip {
	String user;
	long startTime;
	
	public ClipLive(String user, long startTime) {
		super();
		this.user = user;
		this.startTime = startTime;
	}
	
	public ClipLive() {
	}

	@Override
	public void pause() {
		System.out.println("live clip paused");
	}

	@Override
	public void stop() {
		System.out.println("live clip stopped");		
	}

	@Override
	public void resume() {
		System.out.println("live clip resumed");		
	}

	@Override
	public void start() {
		System.out.println("live clip started");		
	}
		
}
