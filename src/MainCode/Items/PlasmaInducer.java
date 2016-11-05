package MainCode.Items;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class PlasmaInducer extends Weapon implements ItemInterface{

	private boolean isKeyItem;
	
	public PlasmaInducer()
	{
		setItemName("Plasma Inducer");
		setItemDescription("Nikola would have been proud of this invention");
		setItemUse("Equip to fight monsters.");
		this.isKeyItem = false;
		setWeaponDamage(100);
	}
	
	public boolean isKeyItem()
	{
		return isKeyItem;
	}

	public void setKeyItem(boolean isKeyItem)
	{
		this.isKeyItem = isKeyItem;
	}
	
	@Override
	public String toString() {
		return "\n" + getItemName() + "\n" + getItemDescription() + "\n" + getItemUse();
	}

}
