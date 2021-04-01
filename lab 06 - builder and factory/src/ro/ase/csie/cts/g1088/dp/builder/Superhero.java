package ro.ase.csie.cts.g1088.dp.builder;

public class Superhero {
	private String name;
	private int lifePoints;
	
	private boolean isEnemy;
	private boolean isInjured;
	
	private WeaponInterface leftWeapon;	
	private WeaponInterface rightWeapon;
	
	private SuperpowerInterface superPower;
	private SuperpowerInterface superSuperPower;
	
	private Superhero() {
	}
	
	private Superhero(String name, int lifePoints, boolean isEnemy, boolean isInjured, WeaponInterface leftWeapon,
			WeaponInterface rightWeapon, SuperpowerInterface superPower, SuperpowerInterface superSuperPower) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.isEnemy = isEnemy;
		this.isInjured = isInjured;
		this.leftWeapon = leftWeapon;
		this.rightWeapon = rightWeapon;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
	}

	public static class SuperheroBuilder {
		Superhero superHero = null;
		public SuperheroBuilder(String name, int lifePoints) {
			Superhero superHero = new Superhero();
			superHero.name = name;
			superHero.lifePoints = lifePoints;
		}
		
		public SuperheroBuilder isEnemy() {
			this.superHero.isEnemy = true;
			return this;
		}
		
		public SuperheroBuilder isInjured() {
			this.superHero.isInjured = true;
			return this;
		}
		
		public SuperheroBuilder setLeftWeapon(WeaponInterface weapon) {
			this.superHero.leftWeapon = weapon;
			return this;
		}
		
		public SuperheroBuilder setRighttWeapon(WeaponInterface weapon) {
			this.superHero.rightWeapon = weapon;
			return this;
		}
		
		public SuperheroBuilder setSuperpower (SuperpowerInterface superPower) {
			this.superHero.superPower = superPower;
			return this;
		}
		
		public SuperheroBuilder setSuperSuperpower (SuperpowerInterface superSuperPower) {
			this.superHero.superSuperPower = superSuperPower;
			return this;
		}
		
		public Superhero build() {
			return superHero;
		}
	}
			
}
