package MainCode.Monster;

import MainCode.Items.HealthKit;
import MainCode.Items.LeadPipe;

public class ReturnCleaningUnit extends Monster implements MonsterInterface
{
	public ReturnCleaningUnit()
	{
		setMaxHealth(250);
		setWeapon(new LeadPipe());
		setMonsterID(11);
		setItemDrop(new HealthKit());
		setMonsterDescription("");


	}

	@Override
	public void createMonster() {
		// TODO Auto-generated method stub

	}
}