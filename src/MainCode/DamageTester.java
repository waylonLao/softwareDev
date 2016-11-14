package MainCode;

import MainCode.Items.Item;
import MainCode.Items.Weapon;
import MainCode.Monster.Monster;
import MainCode.Monster.Player;

/**
* @author nklemenc
*/
public class DamageTester {


	public static void main(String[] args) {
		
		
		Item testItem = new Item();
		Weapon testWeapon = new Weapon();
		
		Player testPlayer = new Player();
		Monster testMonster = new Monster();
		
		testPlayer.doDamage(testMonster);
		testPlayer.doDamage(testMonster);
		testPlayer.doDamage(testMonster);
		testPlayer.doDamage(testMonster);
		testPlayer.doDamage(testMonster);
		testPlayer.doDamage(testMonster);
		testPlayer.doDamage(testMonster);
		testPlayer.doDamage(testMonster);
		
		System.out.println(testPlayer.takeDamage(testMonster));
	}

}
