package MainCode;
/**
* edited by nklemenc
*/
public class Weapon extends Item {
	private int weaponDamage;

	public Weapon(int itemID, int weaponDmg) {
		super(itemID);
		weaponDamage = weaponDmg;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the weaponDamage
	 */
	public int getWeaponDamage() {
		return weaponDamage;
	}

	/**
	 * @param weaponDamage the weaponDamage to set
	 */
	public void setWeaponDamage(int weaponDamage) {
		this.weaponDamage = weaponDamage;
	}
	
	

}
