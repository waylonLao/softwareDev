/**
 * Josh Tran
 * Date: Nov 1, 2016
 */
package MainCode;

/**
 * @author Joshua Tran
 * Date: Nov 1, 2016
 */
public class YellowCard extends KeyCard{
	
	private boolean isKeyItem;
	
	public YellowCard()
	{
		super();
		setColor("YELLOW");
		setItemName("Yellow Key Card");
		setItemDescription("A yellow key card.");
		setItemUse("Use this to open yellow doors.");
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
