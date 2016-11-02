/**
 * Josh Tran
 * Date: Nov 1, 2016
 */
package MainCode;

/**
 * @author Joshua Tran
 * Date: Nov 1, 2016
 */
public class BlueCard extends KeyCard{
	
	private boolean isKeyItem;

	public BlueCard()
	{
		setColor("BLUE");
		setItemName("Blue Key Card");
		setItemDescription("A blue key card.");
		setItemUse("Use this to open blue doors.");
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
	
}
