package MainCode;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class CarbonNanotubeRope extends Tool implements ItemInterface{

	public CarbonNanotubeRope()
	{
		setItemName("Carbon Nanotube Rope");
		setItemDescription("A black rope made out of carbon nanotubes.");
		setItemUse("Use this to safely come back from outer space");
		setSparkleValue(1);
	}
	
	@Override
	public String toString() {
		return getItemName() + "\n" + getItemDescription() + "\n" + getItemUse();
	}

}
