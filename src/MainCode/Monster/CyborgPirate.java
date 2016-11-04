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



import MainCode.Items.HealthKit;
import MainCode.Items.KeyCard;
import MainCode.Items.LeadPipe;

public class CyborgPirate extends Monster implements monsterInterface
{
	public CyborgPirate()
	{
		//super(100, new LeadPipe(), 9, "Alien Commando", "An incomprehensible alien with an assault weapon.");
		setMaxHealth(100);
		setWeapon(new LeadPipe());
		setMonsterID(9);
		setItemDrop(new KeyCard());

	}

	@Override
	public void createMonster() {
		// TODO Auto-generated method stub

	}
	
	
}



