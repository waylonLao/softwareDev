package MainCode;
/**
* @author nklemenc
*/
public class Sprite {
	
	private int Health;
	private Weapon WeaponID;
	
	
	
	/**
	 * @param health
	 * @param weaponID
	 */
	public Sprite(int health, Weapon weaponID) {
		Health = health;
		WeaponID = weaponID;
	}



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
	public Weapon getWeaponID() {
		return WeaponID;
	}



	/**
	 * @param weaponID the weaponID to set
	 */
	public void setWeaponID(Weapon weaponID) {
		WeaponID = weaponID;
	}



	public void doDamage(Monster target){
		target.setHealth(target.getHealth() - this.getWeaponID().getWeaponDamage());
		System.out.println("You deal " + this.getWeaponID().getWeaponDamage() + " damage to the " + target.getMonsterName());
		System.out.println("The " + target.getMonsterName() + " now has " + target.getHealth() + " health ");
		
	}

}
