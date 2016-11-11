package MainCode.Items;
/**
* edited by nklemenc
*/
public class Weapon extends Item implements ItemInterface
{
	private int weaponDamage;

     /**
	 * 
	 */
	public Weapon() 
	{
		setIsWeapon(true);
		weaponDamage = 1;
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

	@Override
	public void createItem() {
		// TODO Auto-generated method stub
		
	}
	
	

}
