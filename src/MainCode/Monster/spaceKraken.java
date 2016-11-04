package MainCode.Monster;


import MainCode.HealthKit;
import MainCode.Item;
import MainCode.LeadPipe;

public class spaceKraken extends Monster implements monsterInterface

{
	private Item itemDrop;
	
	public spaceKraken()
{
	//super(health, wpn, monsterID, monsterName, monsterDescription, itemDrop);
	super(150, new LeadPipe(), 10, "Space Kraken", "A giant, anomalous squid. ");
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

