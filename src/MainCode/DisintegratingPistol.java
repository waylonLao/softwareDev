package MainCode;

public class DisintegratingPistol extends Item implements ItemInterface{

	public DisintegratingPistol()
	{
		setItemName("Disintegrating Pistol");
		setItemDescription("It feels lighter than expected and has a simple trigger to fire.");
		setItemUse("Equip to fight monsters.");
	}
	
	@Override
	public String toString() {
		return getItemName() + "\n" + getItemDescription() + "\n" + getItemUse();
	}

}
