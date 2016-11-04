package MainCode.Monster;

import MainCode.Items.Weapon;

/**
* @author nklemenc
*/
public class Sprite {
	
	private int health;
	private int maxHealth;
	private Weapon weaponID;
	private String name;
	
	
	
	/**
	 * @param health
	 * @param weaponID
	 */
	public Sprite(int h, Weapon w, String n) {
		maxHealth = h;
		health = h;
		weaponID = w;
		name = n;
	}



	/**
	 * @return the maxHealth
	 */
	public int getMaxHealth() {
		return maxHealth;
	}



	/**
	 * @param maxHealth the maxHealth to set
	 */
	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}



	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}



	/**
	 * @param health the health to set
	 */
	public void setHealth(int newHealth) {
		health = newHealth;
	}



	/**
	 * @return the weaponID
	 */
	public Weapon getWeaponID() {
		return weaponID;
	}



	/**
	 * @param weaponID the weaponID to set
	 */
	public void setWeaponID(Weapon newWeaponID) {
		weaponID = newWeaponID;
	}
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	public String doDamage(Sprite target){
		target.setHealth(target.getHealth() - this.getWeaponID().getWeaponDamage());
		if(target.getHealth() <= 0){
			return target.getName() + " has been defeated!";
		}
		return this.getName() + " dealt " + this.getWeaponID().getWeaponDamage() + " damage to the " + target.getName();
		
		
	}
	
	public String takeDamage(Sprite target){
		this.setHealth(this.getHealth() - target.getWeaponID().getWeaponDamage());
		if(this.getHealth() <= 0){
			return "You died.";
		}
		return target.getName() + " has dealt " + target.getWeaponID().getWeaponDamage() + " damage to you ";
	}

}
