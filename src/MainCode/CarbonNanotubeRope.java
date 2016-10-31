package MainCode;

public class CarbonNanotubeRope extends Item implements ItemInterface{

	public CarbonNanotubeRope()
	{
		setItemName("Carbon Nanotube Rope");
		setItemDescription("A black rope made out of carbon nanotubes.");
		setItemUse("Use this to safely come back from outer space");
	}
	
	@Override
	public String toString() {
		return getItemName() + "\n" + getItemDescription() + "\n" + getItemUse();
	}

}
