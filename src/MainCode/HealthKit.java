package MainCode;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class HealthKit extends Consumable implements ItemInterface {
	
	private boolean isKeyItem;
	
	public HealthKit() {
		super();
		setItemName("Health Kit");
		setItemUse("Use to heal yourself for 50 HP.");
		setItemDescription("A white box with a swiss army cross on it.");
		setSparkleValue(1);
		this.isKeyItem = false;
		
	}

	public Item createHealthKit()
	{
		HealthKit hK = new HealthKit();
		return hK;
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
