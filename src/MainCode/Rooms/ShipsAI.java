/**
 * Josh Tran
 * Date: Nov 9, 2016
 */
package MainCode.Rooms;

import MainCode.Items.YellowCard;
import MainCode.Monster.CyborgPirate;

/**
 * @author Joshua Tran
 * Date: Nov 9, 2016
 */
public class ShipsAI extends PoweredRoom{
	
	private int counter;
	private String online = "Online";
	private String offline = "Offline";
	
	public ShipsAI()
	{
		setRoomName("Ships AI Room");
		setNumberOfExits(1);
		//Dialog if statement
		if(isPowered() == false)
		{
			setRoomDescription("You can barely see through the darkness to find the terminal to plug in the E-cell.");
		}
		else if(isPowered() == true)
		{
			counter++;
			setRoomDescription("Hello, I am Quantum. How can I help you today?, said the ships AI. You respond, What happened to the ship."
					+ "The ship was attacked by a Kraken.  That before this incident was a deep space freighter mythical creature.  "
					+ "It has been described as a giant glowing squid the size of an entire ship, "
					+ "that floats through space attacking ships that come in close contact with it.  It is also..... \n\nCutting of the AI you ask, "
					+ "That enough.  What is the status of the rest of the ship? \n\nStructural integrity is down to 62.7%.  Weapons, engine, and navigation are off line. "
					+ " Communications is sending a destress signal out into space.  The good news is that all systems just need minor repairs and working e-cells"
					+ " Says the quantum. \n\nThank god! You say.");
			addMonster(new CyborgPirate());
			addItem(new YellowCard());
		}
		else if(counter > 1)
		{
			setRoomDescription("Hello, I am Quantum. The status of the ships system is " + returnStatus() +" , ships AI.");
		}
	}

	/**
	 * @return the counter
	 */
	public int getCounter() {
		return counter;
	}

	/**
	 * @param counter the counter to set
	 */
	public void setCounter(int counter) {
		this.counter = counter;
	}

	/**
	 * @return the online
	 */
	public String getOnline() {
		return online;
	}

	/**
	 * @param online the online to set
	 */
	public void setOnline(String online) {
		this.online = online;
	}

	/**
	 * @return the offline
	 */
	public String getOffline() {
		return offline;
	}

	/**
	 * @param offline the offline to set
	 */
	public void setOffline(String offline) {
		this.offline = offline;
	}

	public String returnStatus()
	{
		if(isPowered() == false)
		{
			return offline;
		}
		else
		{
			return online;
		}
	}
}
