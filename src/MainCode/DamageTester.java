package MainCode;
/**
* @author nklemenc
*/
public class DamageTester {


	public static void main(String[] args) {
		
		
		Item testItem = new Item(1);
		Weapon testWeapon = new Weapon(1, 25);
		
		Player testPlayer = new Player(200, testWeapon);
		Monster testMonster = new Monster(200, testWeapon, 1, "Test Monster", "This is a test Monster", testItem);
		
		testPlayer.doDamage(testMonster);
		testPlayer.doDamage(testMonster);
		testPlayer.doDamage(testMonster);
		testPlayer.doDamage(testMonster);
		testPlayer.doDamage(testMonster);
		testPlayer.doDamage(testMonster);
		testPlayer.doDamage(testMonster);
		testPlayer.doDamage(testMonster);
	}

}
