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



public class AlienCommando extends Monster implements monsterInterface
{
	private Item itemDrop;

	public AlienCommando()
	{
		LeadPipe lP =new LeadPipe();
		//super(100, new LeadPipe(), 9, "Alien Commando", "An incomprehensible alien with an assault weapon.");
		setMaxHealth(100);
		setWeapon(lP);
		setMonsterID(9);
		this.setItemDrop(new ConcussionGrenade());

	}

	@Override
	public void createMonster() {
		// TODO Auto-generated method stub

	}
}