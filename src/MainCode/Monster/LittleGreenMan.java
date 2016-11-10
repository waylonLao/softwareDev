package MainCode.Monster;

import MainCode.Items.KeyCard;
import MainCode.Items.LeadPipe;

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



	public class LittleGreenMan extends Monster implements MonsterInterface
	{
		public LittleGreenMan()
		{
			setMonsterName("Little Green Man");
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
