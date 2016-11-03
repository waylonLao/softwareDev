package MainCode;

public class alienCommando extends Monster implements monsterInterface
{

	public alienCommando(int health, Weapon wpn, int monsterID, String monsterName, String monsterDescription,
			Item itemDrop) {
		//super(health, wpn, monsterID, monsterName, monsterDescription, itemDrop);
		super(monsterID, wpn, monsterID, monsterDescription, monsterDescription, itemDrop);
		
	}
	
	
	
}
