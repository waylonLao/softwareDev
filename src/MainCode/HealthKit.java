package MainCode;

public class HealthKit extends Item implements ItemInterface {
	
	public HealthKit(int itemID) {
		super(itemID);
	}

	public Item createHealthKit()
	{
		Item consumable = new Item(1);
		consumable.setItemName("Health Kit");
		consumable.setItemDescription("A white box with a swiss army cross on it");
		consumable.setItemUse("Use to heal yourself for 50 HP");
		return consumable;
		
	}
}
