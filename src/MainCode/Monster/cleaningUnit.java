package MainCode.Monster;
/**
 * Class: cleaningUnit.java
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

public class cleaningUnit extends Monster implements monsterInterface

{

	private Item itemDrop;
	
	public cleaningUnit()
{
	//super(health, wpn, monsterID, monsterName, monsterDescription, itemDrop);
	super(30, new LeadPipe(), 1, "Rougue Cleaning Unit", "A pissed off vacuum cleaner,"
			+ " easily killed, used as an early tutorial monster ");
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


