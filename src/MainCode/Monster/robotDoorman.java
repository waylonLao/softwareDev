package MainCode.Monster;
/**
 * Class: robotDoorman.java
 * 
 * @author afirdaus
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2014 
 * Written: Nov 3, 2016
 * 
 * 
 *  This class � ******
 * 
 *  Purpose: � ******
 */


import MainCode.Item;
import MainCode.LeadPipe;
import MainCode.PlasmaInducer;

public class robotDoorman extends Monster implements monsterInterface

{
private Item itemDrop;
	
	public robotDoorman()
{
	//super(health, wpn, monsterID, monsterName, monsterDescription, itemDrop);
	super(50, new LeadPipe(), 2, "Robot Doorman", "A well-dressed robot in "
			+ "moderate disrepair  ");
	this.setItemDrop(new PlasmaInducer());
		
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

