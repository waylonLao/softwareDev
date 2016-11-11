package MainCode.Monster;

import MainCode.Items.ConcussionGrenade;
import MainCode.Items.LeadPipe;
import MainCode.Items.PlasmaInducer;

/**
 * Class: roboChef.java
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




public class RoboChef extends Monster implements MonsterInterface
{
	public RoboChef()
	{

		//super(100, new LeadPipe(), 9, "Alien Commando", "An incomprehensible alien with an assault weapon.");
		setMaxHealth(100);
		setWeapon(new LeadPipe());
		setMonsterID(4);
		setItemDrop(new PlasmaInducer());
		setMonsterDescription("A deranged culinary robot with "
				+ "a French accent and a curly moustache.");

	}

	@Override
	public void createMonster() {
		// TODO Auto-generated method stub

	}

}
