package MainCode.Monster;

import MainCode.Items.Item;
import MainCode.Items.Weapon;

public class InvTester {

	public InvTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Weapon w = new Weapon("hand", "asdf", "use", 5);
		Player p = new Player();
		//System.out.println(p.getSpriteInv().toString());
		Item i = new Item();
		p.takeItem(i);
		
		System.out.println(p.getSpriteInv().getItemList().size());
	}

}
