package MainCode.Monster;

import MainCode.Items.ConcussionGrenade;
import MainCode.Items.Item;
import MainCode.Items.LeadPipe;
import MainCode.Items.Weapon;

/**
 * Class: alienCommando.java
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



public class AlienCommando extends Monster implements MonsterInterface
{

	public AlienCommando()
	{

		setMonsterName("Alien Commando");
		setMaxHealth(100);
		setWeapon(new LeadPipe());
		setMonsterID(9);
		setItemDrop(new ConcussionGrenade());
		setMonsterDescription("An incomprehensible alien"
				+ "with an assault weapon.");

	}

	@Override
	public void createMonster() {
		// TODO Auto-generated method stub

	}
}