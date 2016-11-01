package MainCode;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class HealthKit extends Consumable implements ItemInterface {
	
	
	public HealthKit() {
		super();
		setItemName("Health Kit");
		setItemUse("Use to heal yourself for 50 HP.");
		setItemDescription("A white box with a swiss army cross on it.");
		setSparkleValue(1);
		
	}

	public Item createHealthKit()
	{
		HealthKit hK = new HealthKit();
		return hK;
	}

	@Override
	public String toString() {
		return getItemName() + "\n" + getItemDescription() + "\n" + getItemUse();
	}
	
	
}
