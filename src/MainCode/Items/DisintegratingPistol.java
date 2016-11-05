package MainCode.Items;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class DisintegratingPistol extends Weapon implements ItemInterface{

	public DisintegratingPistol()
	{
		super();
		setItemName("Disintegrating Pistol");
		setItemDescription("It feels lighter than expected and has a simple trigger to fire.");
		setItemUse("Equip to fight monsters.");
		setWeaponDamage(75);
	}
	
	@Override
	public String toString() {
		return "\n" + getItemName() + "\n" + getItemDescription() + "\n" + getItemUse();
	}

	@Override
	public void createItem() {
		// TODO Auto-generated method stub
		
	}

}
