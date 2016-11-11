package MainCode.Monster;

import MainCode.Items.HealthKit;
import MainCode.Items.LeadPipe;

public class ReturnCleaningUnit extends Monster implements monsterInterface
{
	public ReturnCleaningUnit()
	{
		//super(100, new LeadPipe(), 9, "Alien Commando", "An incomprehensible alien with an assault weapon.");
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