package MainCode.Monster;
/**
 * Class: cyborgPirate.java
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


import MainCode.BlueCard;
import MainCode.Item;
import MainCode.LeadPipe;

public class CyborgPirate extends Monster implements monsterInterface
{

	private Item itemDrop;
	
	public CyborgPirate()
{
	//super(health, wpn, monsterID, monsterName, monsterDescription, itemDrop);
	super(100, new LeadPipe(), 7, "Cyborg Pirate ", "A robotic pirate with a bad attitude. ");
	this.setItemDrop(new BlueCard());
		
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



