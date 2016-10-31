package MainCode;

public class HealthKit extends Item implements ItemInterface {
	
	
	public HealthKit(int itemID) {
		super();
	}

	public Item createHealthKit()
	{
		Item consumable = new Item();
		
		consumable.setItemName("Health Kit");
		consumable.setItemDescription("A white box with a swiss army cross on it");
		consumable.setItemUse("Use to heal yourself for 50 HP");
		return consumable;
		
	}

	@Override
	public String toString() {
		return "HealthKit [createHealthKit()=" + createHealthKit() + ", getItemID()=" + getItemID() + ", getItemName()="
				+ getItemName() + ", getItemDescription()=" + getItemDescription() + ", getItemUse()=" + getItemUse()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
}
