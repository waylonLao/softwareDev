package MainCode;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class LeadPipe extends Weapon implements ItemInterface{

	private boolean isKeyItem;
	
	public LeadPipe()
	{
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
		return getItemName() + "\n" + getItemDescription() + "\n" + getItemUse();
	}

}
