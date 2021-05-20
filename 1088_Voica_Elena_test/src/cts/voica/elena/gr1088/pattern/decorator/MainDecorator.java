package cts.voica.elena.gr1088.pattern.decorator;

public class MainDecorator {
	public static void main(String[] args) {
		IClip clip1 = new ClipVideo("ana", 52664);
		IClip clip2 = new ClipVideo("maria", 55685);
		IClip clip3 = new ClipVideo("dana", 555666);
		IClip clip4 = new ClipVideo("rodica", 554488);
		
		clip1 = new DecoratorReclama(clip1, 20);
		clip3 = new DecoratorReclamaFinal(clip3, 5);
		
		clip1.start();
		clip2.start();
		clip3.start();
		clip4.start();
		
		System.out.println("***********");
		
		clip1.stop();
		clip2.stop();
		clip3.stop();
		clip4.stop();
	}
}
