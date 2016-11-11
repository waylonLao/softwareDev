/**
 * Josh Tran
 * Date: Nov 9, 2016
 */
package MainCode.Rooms;

import MainCode.Monster.AlienCommando;

/**
 * @author Joshua Tran
 * Date: Nov 9, 2016
 */
public class EngineRoom extends PoweredRoom{
	
	public EngineRoom()
	{
		setNumberOfExits(6);
		setRoomName("Engine Room");
		setRoomDescription("This is a large grey room with multiple exits. "
				+ "There is a large Ion Thruster in the middle of the room. "
				+ "The Ion thruster is not powered on, and all indicator gauges "
				+ "show that there is not enough impulse power to provide sufficient "
				+ "propulsion for escape. Damage to the thruster and missing e-cells are "
				+ "prohibiting the engine from powering up. There is a heavily armored alien "
				+ "commando with blades on his arms. The alien commando is on a mission to dismantle "
				+ "the ships Ion thruster and steal the e-cells. 6 exits, 2 south exits lead to the hallway, "
				+ "2 west exits lead to weapons room and cargo1, 2 east exits lead to cryo crew1 and cryo crew2.");
		addMonster(new AlienCommando());
	}

}
