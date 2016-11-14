package MainCode.Items;

import MainCode.Monster.Sprite;

/**
 * @author Neal Klemenc
 */
public class HealthPack extends Item {

	public HealthPack() {
		// TODO Auto-generated constructor stub
	}

	public HealthPack(String name, String description, String use) {
		super(name, description, use);
		// TODO Auto-generated constructor stub
	}
	
	
	public String itemFunction(Sprite p){
		if(p.getHealth() == p.getMaxHealth()){
			return "You are already fully healed.";
		}
		p.setHealth(Math.min(p.getHealth() + 50, p.getMaxHealth()));
		return "You bandage your wounds.";
	}

}
