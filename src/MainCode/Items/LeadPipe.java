package MainCode.Items;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class LeadPipe extends Weapon{
	
	public LeadPipe()
	{
		//setItemID(1);
		setItemName("Lead Pipe");
		setItemDescription("A long heavy pipe made out of lead.");
		setItemUse("Equip to fight monsters.");
		setWeaponDamage(25);
		//setIsKeyItem(false);
	}
	

	
	@Override
	public String toString() {
		return "\n" + getItemName() + "\n" + getItemDescription() + "\n" + getItemUse();
	}

	/* (non-Javadoc)
	 * @see MainCode.ItemInterface#createItem()
	 */
	

}
