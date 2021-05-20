package cts.voica.elena.gr1088.pattern.composite;

import java.util.ArrayList;

public class Playlist extends ClipAbstract {
	ArrayList<IClip> clips;
	String name;
	int numberOfClips;
	
	public Playlist(String name, int numberOfClips) {
		super();
		this.clips = new ArrayList<>();
		this.name = name;
		this.numberOfClips = numberOfClips;
	}
	
	@Override
	public void addClip(IClip clip) {
		clips.add(clip);
	}

	@Override
	public void pause() {
		System.out.println(name + ": pause playlist");
	}

	@Override
	public void stop() {
		System.out.println(name + ": stop playlist");
	}

	@Override
	public void resume() {
		System.out.println(name + ": resume playlist");
	}

	@Override
	public void start() {
		System.out.println(name + ": start playlist");
		for(IClip clip : clips) {
			clip.start();
			clip.stop();
		}
	}	
}
