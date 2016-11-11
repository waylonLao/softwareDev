package MainCode.Monster;


import MainCode.Items.ConcussionGrenade;
import MainCode.Items.HealthKit;
import MainCode.Items.LeadPipe;

public class TunnelingHorror extends Monster implements MonsterInterface
{
	public TunnelingHorror()
	{

		//super(100, new LeadPipe(), 9, "Alien Commando", "An incomprehensible alien with an assault weapon.");
		setMaxHealth(100);
		setWeapon(new LeadPipe());
		setMonsterID(9);
		setItemDrop(new HealthKit());
		setMonsterDescription("A large alien worm always found "
				+ "in the keycard room.  If left unde-feated "
				+ "for 2 trips into the keycard room she will"
				+ " eat through the hull and the game is over. ");

	}

	@Override
	public void createMonster() {
		// TODO Auto-generated method stub
		
	}
}
