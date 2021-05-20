package ro.ase.csie.cts.g1088.dp.memento;

import java.util.ArrayList;
import java.util.List;
public class HistoryManager {
	List<MementoHero> saves = new ArrayList<>();
	
	public void addSalvation(MementoHero memento) {
		this.saves.add(memento);
	}
	
	public MementoHero getLastSave() {
		if(this.saves.size() > 0) {
			MementoHero lastSave = this.saves.get(this.saves.size()-1);
			this.saves.remove(lastSave);
			return lastSave;
		} else {
			return null;
		}
	}
}
