package cts.voica.elena.gr1088.pattern.composite;

public class MainComposite {
	public static void main(String[] args) {
		ClipAbstract p1 = new Playlist("music", 2);
		ClipAbstract p2 = new Playlist("movies", 10);
		ClipAbstract p3 = new Playlist("series", 12);
		ClipAbstract p4 = new Playlist("songs", 28);

		ClipAbstract c1 = new ClipVideo("dogs", 224566, 10);
		ClipAbstract c2 = new ClipVideo("cats", 285666, 50);
		ClipAbstract c3 = new ClipVideo("animals", 25552, 20);
		
		p1.addClip(c1);
		p1.addClip(p2);
		p1.addClip(p3);
		p2.addClip(p4);
		p2.addClip(c2);
		p3.addClip(c3); 
		
		p1.start();
	}
}
