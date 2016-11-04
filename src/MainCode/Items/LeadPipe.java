package MainCode.Items;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class LeadPipe extends Weapon{

	private boolean isKeyItem;
	
	public LeadPipe()
	{
		setItemID(1);
		setItemName("Lead Pipe");
		setItemDescription("A long heavy pipe made out of lead.");
		setItemUse("Equip to fight monsters.");
		this.isKeyItem = false;
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

	/* (non-Javadoc)
	 * @see MainCode.ItemInterface#createItem()
	 */
	

}
