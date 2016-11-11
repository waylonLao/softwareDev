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

public class CyborgPirate extends Monster implements MonsterInterface
{
	public CyborgPirate()
	{
		setMonsterName("Cyborg Pirate");
		setMaxHealth(100);
		setWeapon(new LeadPipe());
		setMonsterID(7);
		setItemDrop(new KeyCard());
		setMonsterDescription("A robotic pirate with a bad"
				+ "attitude.");

	}

	@Override
	public void createMonster() {
		// TODO Auto-generated method stub

	}
	
	
}



