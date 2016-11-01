package MainCode;
/**
* @author nklemenc
*/
public class DamageTester {


	public static void main(String[] args) {
		
		
		Item testItem = new Item();
		Weapon testWeapon = new Weapon();
		
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
		
		System.out.println(testPlayer.takeDamage(testMonster));
	}

}
