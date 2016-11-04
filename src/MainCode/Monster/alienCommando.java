package MainCode.Monster;

import MainCode.Items.Item;
import MainCode.Items.Weapon;

public class alienCommando extends Monster implements monsterInterface
{
	//your constructors need to be no param constructor
	//you have to hard code all of these variables using setters into this specific class
	public alienCommando(int health, Weapon wpn, int monsterID, String monsterName, String monsterDescription, Item itemDrop) {
		super(monsterID, wpn, monsterID, monsterName, 
				monsterDescription, itemDrop);
		
	}
	
	
	
}
