package MainCode.Monster;


import MainCode.HealthKit;
import MainCode.Item;
import MainCode.LeadPipe;

public class tunnelingHorror extends Monster implements monsterInterface
{
	private Item itemDrop;
	
	public tunnelingHorror()
{
	//super(health, wpn, monsterID, monsterName, monsterDescription, itemDrop);
	super(50, new LeadPipe(), 3, "Alien Commando", "A large alien worm always "
			+ "found in the keycard room.  If left unde-feated for 2 trips "
			+ "into the keycard room she will eat through the hull and the game is over. ");
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
