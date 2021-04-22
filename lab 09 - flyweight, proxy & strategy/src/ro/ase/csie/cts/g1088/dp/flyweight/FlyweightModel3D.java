package ro.ase.csie.cts.g1088.dp.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightModel3D implements FlyweightInterfaceModel3D {
	public String modelName;
	List<Integer> modelPoints = new ArrayList<>();
	
	
	
	public FlyweightModel3D(String modelName, List<Integer> modelPoints) {
		super();
		this.modelName = modelName;
		this.modelPoints = modelPoints;
	}


	public FlyweightModel3D(String modelName) {
		super();
		this.modelName = modelName;
	}
	

	@Override
	public void showScreen(ScreenData data) {
		System.out.println(String.format("Afisare %s la coordonatele %d, %d, %d cu %s", modelName, data.x, data.y, data.z));
	}
	

}
