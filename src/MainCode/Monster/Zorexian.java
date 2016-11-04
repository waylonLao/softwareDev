package MainCode.Monster;


import MainCode.HealthKit;
import MainCode.Item;
import MainCode.LeadPipe;

public class Zorexian extends Monster implements monsterInterface
{

	private Item itemDrop;
	
	public Zorexian()
{
	//super(health, wpn, monsterID, monsterName, monsterDescription, itemDrop);
	super(100, new LeadPipe(), 9, "Zocrexian Infiltrator ", "An alien hound all "
			+ "the way from Zocrexia. ");
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
