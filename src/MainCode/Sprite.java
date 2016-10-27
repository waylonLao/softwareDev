package MainCode;
/**
* @author nklemenc
*/
public class Sprite {
	
	private int health;
	private Weapon weaponID;
	private String name;
	
	
	
	/**
	 * @param health
	 * @param weaponID
	 */
	public Sprite(int h, Weapon w, String n) {
		health = h;
		weaponID = w;
		name = n;
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



	public void doDamage(Sprite target){
		target.setHealth(target.getHealth() - this.getWeaponID().getWeaponDamage());
		System.out.println(this.getName() + " dealt " + this.getWeaponID().getWeaponDamage() + " damage to the " + target.getName());
		System.out.println("The " + target.getName() + " now has " + target.getHealth() + " health ");
		if(target.getHealth() <= 0){
			System.out.println(target.getName() + " has been defeated!");
		}
		
		
	}

}
