package MainCode.Monster;

import java.io.Serializable;
import java.util.ArrayList;

import MainCode.Items.Inventory;
import MainCode.Items.Item;
import MainCode.Items.Weapon;

/**
* @author nklemenc
*/
public class Sprite implements Serializable{
	
	protected int health;
	protected int maxHealth;
	protected Weapon weapon;
	protected String name;
	private int stunDuration;
	private Inventory spriteInv;
	
	
	public Sprite(){
		maxHealth = 50;
		health = 50;
		weapon = null;
		name = "player";
		spriteInv = new Inventory();
	}
	
	/**
	 * @param health
	 * @param weaponID
	 */
	public Sprite(int h, Weapon w, String n) {
		maxHealth = h;
		health = h;
		weapon = w;
		name = n;
		spriteInv = new Inventory();
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
	
	
	
	

	/**
	 * @return the spriteInv
	 */
	public Inventory getSpriteInv() {
		return spriteInv;
	}

	/**
	 * @param spriteInv the spriteInv to set
	 */
	public void setSpriteInv(Inventory spriteInv) {
		this.spriteInv = spriteInv;
	}


	

	

}
