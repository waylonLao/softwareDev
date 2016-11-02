/**
 * Josh Tran
 * Date: Nov 1, 2016
 */
package MainCode;

/**
 * @author Joshua Tran
 * Date: Nov 1, 2016
 */
public class RedCard extends KeyCard
{
	private boolean isKeyItem;
	
	public RedCard()
	{
		setColor("RED");
		setItemName("Red Key Card");
		setItemDescription("A red security card.");
		setItemUse("Use this to open red doors.");
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
