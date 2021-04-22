package ro.ase.csie.cts.g1088.dp.flyweight;

public class FlyweigghtTest {

	public static void main(String[] args) {
		ScreenData solder1 = new ScreenData(100, 50, 50, "Green");
		ScreenData solder2 = new ScreenData(100, 100, 50, "Red");
		ScreenData building1 = new ScreenData(10, 10, 0, "Grey");
		ScreenData building2 = new ScreenData(107, 150, 0, "Brown");
		
		FlyweightInterfaceModel3D solderModel = FactoryModel3D.getModel(Model3DType.SOLDER);
		solderModel.showScreen(solder1);
		solderModel.showScreen(solder2);
		
		FactoryModel3D.getModel(Model3DType.BUILDING).showScreen(building1);
		FactoryModel3D.getModel(Model3DType.BUILDING).showScreen(building2);
	}

}
