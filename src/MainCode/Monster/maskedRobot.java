package MainCode.Monster;
/**
 * Class: maskedRobot.java
 * 
 * @author afirdaus
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2014 
 * Written: Nov 3, 2016
 * 
 * 
 *  This class – ******
 * 
 *  Purpose: – ******
 */


import MainCode.HealthKit;
import MainCode.Item;
import MainCode.LeadPipe;

public class maskedRobot extends Monster implements monsterInterface
{
	private Item itemDrop;
	
	public maskedRobot()
{
	//super(health, wpn, monsterID, monsterName, monsterDescription, itemDrop);
	super(50, new LeadPipe(), 8, "Masked Robot", "An aggressive machine who wants to wrestle.");
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
