package MainCode.Items;
/**
* edited by nklemenc
*/
public class Weapon extends Item
{
	private int weaponDamage;

     /**
	 * 
	 */
	public Weapon(String name, String description, String use, int damage) 
	{
		super(name, description, use);
		weaponDamage = damage;
	}

	/**
	 * @return the weaponDamage
	 */
	public int getWeaponDamage() 
	{
		return weaponDamage;
	}

	/**
	 * @param weaponDamage the weaponDamage to set
	 */
	public void setWeaponDamage(int weaponDamage) 
	{
		this.weaponDamage = weaponDamage;
	}

	
	

}
