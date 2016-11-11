package MainCode.Monster;

import MainCode.Items.ConcussionGrenade;
import MainCode.Items.HealthKit;
import MainCode.Items.LeadPipe;

public class SpaceKraken extends Monster implements MonsterInterface

{
	public SpaceKraken()
	{

		//super(100, new LeadPipe(), 9, "Alien Commando", "An incomprehensible alien with an assault weapon.");
		setMaxHealth(150);
		setWeapon(new LeadPipe());
		setMonsterID(10);
		setItemDrop(new HealthKit());
		setMonsterDescription("");


		
	}

	@Override
	public void createMonster() {
		// TODO Auto-generated method stub
		
	}
}

