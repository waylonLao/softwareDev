package MainCode;

public class PlasmaInducer extends Item implements ItemInterface{

	public PlasmaInducer()
	{
		setItemName("Plasma Inducer");
		setItemDescription("Nikola would have been proud of this invention");
		setItemUse("Equip to fight monsters.");
	}
	
	@Override
	public String toString() {
		return getItemName() + "\n" + getItemDescription() + "\n" + getItemUse();
	}

}
