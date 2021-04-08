package ro.ase.csie.cts.g1088.dp.adapter;

import ro.ase.csie.cts.g1088.dp.factory.method.GameCharacter;

public class EaAdapter2GameCharacter extends GameCharacter {
	CharacterInterfaceEA  EACharacter;
	
	public EaAdapter2GameCharacter(CharacterInterfaceEA EACharacter) {
		super();
		this.EACharacter =  EACharacter;
	}

	@Override
	public void walks() {
		EACharacter.move();
	}
		
}
