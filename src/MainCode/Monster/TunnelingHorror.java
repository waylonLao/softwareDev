package MainCode.Monster;

import MainCode.Items.HealthKit;

public class TunnelingHorror extends Monster implements MonsterInterface
{
	public TunnelingHorror()
	{
		setMonsterName("Tunneling Horror");
		setItemDrop(new HealthKit());
		setMaxHealth(50);
		
	}

	@Override
	public void createMonster() {
		// TODO Auto-generated method stub
		
	}
}
