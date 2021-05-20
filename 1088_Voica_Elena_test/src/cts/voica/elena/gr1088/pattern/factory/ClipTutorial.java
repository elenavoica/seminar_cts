package cts.voica.elena.gr1088.pattern.factory;

public class ClipTutorial implements IClip {
	
	String user;
	long uploadTime;
		
	public ClipTutorial(String user, long uploadTime) {
		super();
		this.user = user;
		this.uploadTime = uploadTime;
	}
	
	public ClipTutorial() {
	}

	@Override
	public void pause() {
		System.out.println("tutorial clip paused");		
	}

	@Override
	public void stop() {
		System.out.println("tutorial clip stopped");		
	}

	@Override
	public void resume() {
		System.out.println("tutorial clip resumed");		
	}

	@Override
	public void start() {
		System.out.println("tutorial clip started");		
	}

}
