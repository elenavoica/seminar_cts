package ro.ase.csie.cts.g1088.dp.memento;

public class MementoTest {

	public static void main(String[] args) {
		
		HistoryManager history = new HistoryManager();
		Superhero superman = new Superhero("Superman", 100, "fly");
		
		history.addSalvation(superman.save());
		superman.isInjured(10);
		superman.isInjured(50);
		
		System.out.println("Life points: " + superman.lifePoints);
		superman.addSave(history.getLastSave());
	}

}
