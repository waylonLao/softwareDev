package MainCode;

public class HealthKit extends Item implements ItemInterface {
	
	
	public HealthKit() {
		super();
		setItemName("Health Kit");
		setItemUse("Use to heal yourself for 50 HP.");
		setItemDescription("A white box with a swiss army cross on it.");
		
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
