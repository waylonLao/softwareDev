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
		
		setMaxHealth(100);
		setWeapon(new LeadPipe());
		setMonsterID(9);
		setItemDrop(new HealthKit());

	}

	@Override
	public void createMonster() {
		// TODO Auto-generated method stub

	}
	
	
	
	}


