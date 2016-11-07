package MainCode.Monster;



import MainCode.Items.ConcussionGrenade;
import MainCode.Items.LeadPipe;

public class TunnelingHorror extends Monster implements monsterInterface
{
	public TunnelingHorror()
	{

		//super(100, new LeadPipe(), 9, "Alien Commando", "An incomprehensible alien with an assault weapon.");
		setMaxHealth(100);
		setWeapon(new LeadPipe());
		setMonsterID(9);
		setItemDrop(new ConcussionGrenade());

	}

	@Override
	public void createMonster() {
		// TODO Auto-generated method stub

	}
}
