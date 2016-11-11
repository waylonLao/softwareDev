package MainCode.Monster;

import MainCode.Items.ConcussionGrenade;
import MainCode.Items.HealthKit;
import MainCode.Items.LeadPipe;

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

public class RogueCleaningUnit extends Monster implements MonsterInterface

{
	public RogueCleaningUnit()
	{

		//super(100, new LeadPipe(), 9, "Alien Commando", "An incomprehensible alien with an assault weapon.");
		setMaxHealth(50);

		setMonsterName("Rogue Cleaning Unit");
		setMaxHealth(100);
		setWeapon(new LeadPipe());
		setMonsterID(9);
		setItemDrop(new HealthKit());
		setMonsterDescription("A suction hose with a chunk of metal stuck in it.");

	}

	@Override
	public void createMonster() {
		// TODO Auto-generated method stub

	}
	
	
	
	}


