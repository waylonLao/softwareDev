package MainCode.Items;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class CarbonNanotubeRope extends Tool implements ItemInterface{

	private boolean isKeyItem;
	
	public CarbonNanotubeRope()
	{
		setItemName("Carbon Nanotube Rope");
		setItemDescription("A black rope made out of carbon nanotubes.");
		setItemUse("Use this to safely come back from outer space");
		setSparkleValue(1);
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
		return getItemName() + "\n" + getItemDescription() + "\n" + getItemUse();
	}

	@Override
	public void createItem() {
		// TODO Auto-generated method stub
		
	}

}
