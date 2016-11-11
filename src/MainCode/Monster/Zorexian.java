package MainCode.Monster;

import MainCode.Items.ConcussionGrenade;
import MainCode.Items.HealthKit;
import MainCode.Items.LeadPipe;

public class Zorexian extends Monster implements MonsterInterface 
{
	public Zorexian()
	{

		//super(100, new LeadPipe(), 9, "Alien Commando", "An incomprehensible alien with an assault weapon.");
		setMaxHealth(100);
		setWeapon(new LeadPipe());
		setMonsterID(9);
		setItemDrop(new HealthKit());
		setMonsterDescription("An alien hound all the way from"
				+ "Zocrexia.");

	}


	@Override
	public void createMonster() {
		// TODO Auto-generated method stub

	}
}