package ro.ase.csie.cts.g1088.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Character3D implements Cloneable {
	String modelFile;
	String color;
	int height;
	
	ArrayList<Integer> graphicP = null;

	public Character3D(String modelFile) {
		System.out.println("loading model from " + modelFile);
		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.modelFile = modelFile;
		
		Random random = new Random();
		graphicP = new ArrayList<>();
		for(int i=0; i<10;i++) {
			graphicP.add(random.nextInt(1000));
		}		
	}
	
	private Character3D() {
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("3d character points: ");
		for(int point : this.graphicP) {
			sb.append(point + "|");
		}
		return sb.toString();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//not with the same constructor
		//Character3D copy = new Character3D(this.modelFile);
		
		Character3D copy = new Character3D();
		copy.color = this.color;
		copy.modelFile = this.modelFile;
		copy.height = this.height;
		copy.graphicP = (ArrayList<Integer>) this.graphicP.clone();
		
		return copy;
	}	
}
