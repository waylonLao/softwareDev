package MainCode.Monster;

import java.io.Serializable;
import java.util.ArrayList;

import MainCode.Items.Item;
import MainCode.Items.Weapon;

/**
* @author nklemenc
*/
public class Sprite implements Serializable {
	
	protected int health;
	protected int maxHealth;
	protected Weapon weapon;
	protected String name;
	private int stunDuration;
	private ArrayList<Item> inventory;
	
	
	public Sprite()
	{
		this.health = 0;
		this.maxHealth = health;
		this.weapon = new MainCode.Items.Weapon();
		this.name = "";
	}
	
	/**
	 * @param health
	 * @param weaponID
	 */
	public Sprite(int h, MainCode.Items.Weapon w, String n) {
		maxHealth = h;
		health = h;
		weapon = w;
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
	public MainCode.Items.Weapon getWeapon() {
		return weapon;
	}



	/**
	 * @param weaponID the weaponID to set
	 */
	public void setWeapon(MainCode.Items.Weapon newWeapon) {
		weapon = newWeapon;
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
	
	



	/**
	 * @return the stunDuration
	 */
	public int getStunDuration() {
		return stunDuration;
	}

	/**
	 * @param stunDuration the stunDuration to set
	 */
	public void setStunDuration(int stunDuration) {
		this.stunDuration = stunDuration;
	}

	public String doDamage(Sprite target){
		target.setHealth(target.getHealth() - this.getWeapon().getWeaponDamage());
		if(target.getHealth() <= 0){
			return target.getName() + " has been defeated!";
		}
		return this.getName() + " dealt " + this.getWeapon().getWeaponDamage() + " damage to the " + target.getName();
		
		
	}
	
	public String takeDamage(Sprite target){
		if(target.getStunDuration() > 0){
			target.setStunDuration(target.getStunDuration() - 1);
			return target.getName() + "is stunned and cannot attack.";
		}
		
		this.setHealth(this.getHealth() - target.getWeapon().getWeaponDamage());
		if(this.getHealth() <= 0){
			return "You died.";
		}
		return target.getName() + " has dealt " + target.getWeapon().getWeaponDamage() + " damage to you ";
	}
	
	public String useItem(Item i){
		return i.getItemFunction();
	}
	
	

}
