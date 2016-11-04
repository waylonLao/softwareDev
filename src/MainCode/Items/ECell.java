package MainCode.Items;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class ECell extends Tool implements ItemInterface{
	
	private boolean isKeyItem;

	public ECell()
	{
		super();
		setItemName("E-Cell");
		setItemDescription("A glowing green rode of an E-Cell.");
		setItemUse("Use to power main rooms.");
		this.isKeyItem = true;
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

	@Override
	public void createItem() {
		// TODO Auto-generated method stub
		
	}

}
