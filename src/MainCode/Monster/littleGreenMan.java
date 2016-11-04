package MainCode.Monster;
/**
 * Class: littleGreenMan.java
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


import MainCode.ConcussionGrenade;
import MainCode.Item;
import MainCode.LeadPipe;

public class littleGreenMan extends Monster implements monsterInterface
{

	private Item itemDrop;
	
	public littleGreenMan()
{
	//super(health, wpn, monsterID, monsterName, monsterDescription, itemDrop);
	super(100, new LeadPipe(), 6, "Little Green Man ", "A prototypical alien. ");
	this.setItemDrop(new ConcussionGrenade());
		
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
