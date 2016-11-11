package MainCode.Monster;

import MainCode.Items.HealthKit;
import MainCode.Items.LeadPipe;

public class ReturnOfCleaningUnit extends Monster implements MonsterInterface
{	
	public ReturnOfCleaningUnit()
	{
		//super(100, new LeadPipe(), 9, "Alien Commando", "An incomprehensible alien with an assault weapon.");
		setMaxHealth(250);
		setWeapon(new LeadPipe());
		setMonsterID(11);
		setItemDrop(new HealthKit());
		setMonsterDescription("The first enemy. Still pissed off.");


	}

	@Override
	public void createMonster() {
		// TODO Auto-generated method stub

	}
}
