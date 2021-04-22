package ro.ase.csie.cts.g1088.dp.flyweight;
import java.util.HashMap;
import java.util.Map;

public class FactoryModel3D {
	public static Map<String, FlyweightInterfaceModel3D> models = new HashMap<>();
	
	static {
		models.put(Model3DType.BUILDING.toString(), new FlyweightModel3D("Building"));
		models.put(Model3DType.SOLDER.toString(), new FlyweightModel3D("Solder"));
	}
	
	public static FlyweightInterfaceModel3D getModel(Model3DType type) {
		return models.get(type.toString());
	}
}
