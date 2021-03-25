package ro.ase.csie.cts.g1088.dp.prototype;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Character3D character1 = new Character3D("model1.3d");
		//Character3D character2 = new Character3D("model1.3d");
		//Character3D character3 = new Character3D("model1.3d");
		
		Character3D charater2 = (Character3D) character1.clone();
		Character3D charater3 = (Character3D) character1.clone();
		
		System.out.println("End");
	}
}
