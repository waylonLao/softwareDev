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
 *  This class – ******
 * 
 *  Purpose: – ******
 */


import MainCode.Items.ConcussionGrenade;
import MainCode.Items.HealthKit;
import MainCode.Items.LeadPipe;

public class RobotDoorman extends Monster implements MonsterInterface

{
	public RobotDoorman()
	{

		//super(100, new LeadPipe(), 9, "Alien Commando", "An incomprehensible alien with an assault weapon.");
		setMaxHealth(50);
		setWeapon(new LeadPipe());
		setMonsterID(2);
		setItemDrop(new HealthKit());
		setMonsterDescription("A well-dressed robot in moderate disrepair");

	}

	@Override
	public void createMonster() {
		// TODO Auto-generated method stub
		
	}
}

