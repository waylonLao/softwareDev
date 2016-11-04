package MainCode.Monster;


import MainCode.HealthKit;
import MainCode.Item;
import MainCode.LeadPipe;

public class returnCleaningUnit extends Monster implements monsterInterface
{

private Item itemDrop;
	
	public returnCleaningUnit()
{
	//super(health, wpn, monsterID, monsterName, monsterDescription, itemDrop);
	super(250, new LeadPipe(), 11, "Return of the Cleaning Unit", "The first monster."
			+ "Still pissed off.");
	this.setItemDrop(new HealthKit());
		
}

	public Item getItemDrop() {
		return itemDrop;
	}

	public void setItemDrop(Item itemDrop) {
		this.itemDrop = itemDrop;
	}

	@Override
	public void createMonster() {
		// TODO Auto-generated method stub
		
	}
	

	
	
}
