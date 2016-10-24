package MainCode;

public class Sprite {
	
	private int Health;
	private int WeaponID;
	
	
	
	/**
	 * @return the health
	 */
	public int getHealth() {
		return Health;
	}



	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		Health = health;
	}



	/**
	 * @return the weaponID
	 */
	public int getWeaponID() {
		return WeaponID;
	}



	/**
	 * @param weaponID the weaponID to set
	 */
	public void setWeaponID(int weaponID) {
		WeaponID = weaponID;
	}



	public void doDamage(){
		//TODO get sprite's weapon damage, update target's Health
	}

}
