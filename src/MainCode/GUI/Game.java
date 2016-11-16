/**Class: ITECH
 * @author Waylon Lao
 * @version 1.0
 * Course : ITEC 3150 Spring 2016
 * Written: January 18, 2012
 *
 *
 * This class – now describe what the class does
 *
 * Purpose: – Describe the purpose of this class
 */

package MainCode.GUI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import MainCode.Items.HealthPack;
import MainCode.Items.Inventory;
import MainCode.Items.Weapon;
import MainCode.Monster.Monster;
import MainCode.Monster.Player;
import MainCode.Rooms.Room;


//Might move this into MainMenu. Maybe...TBD

public class Game
{
	ObjectOutputStream output;
	ObjectInputStream input;

	MainGUI mg;

	Player player;
	private HealthPack healthKit = new HealthPack("Health Kit", "Some basic first-aid.", "Used to heal wounds.");
	private Weapon suctionHose = new Weapon("Suction Hose", "A weak suction hose", "Used to fight", 10);
	private Monster rogueCleaningUnit = new Monster(30, suctionHose, "Rogue Cleaning Unit", "A pissed off vacuum cleaner, easily killed.", healthKit);
	Room room = new Room(0,"Cryo Room","The room has 4 doors and each door has a name plate above it. "
			+ "To the west is a yellow door marked, to the east is a blue door both marked \"Hallway\". To the "
			+ "south holds a grey door labeled \"Command Center\" and to the north is a red door labeled \"Cryogenics Room\"."
			, rogueCleaningUnit, null, false, true, null);
	Inventory inventory;

	public void saveGame(Player player, Room room, Inventory inv) throws FileNotFoundException, IOException{

		this.player = player;
		this.room = room;
		this.inventory = inv;
		output = new ObjectOutputStream(new FileOutputStream("gameSave.dat"));
		output.writeObject(player);
		output.writeObject(room);
		output.writeObject(inv);
	}

	public void loadGame() throws FileNotFoundException, IOException{

		input = new ObjectInputStream(new FileInputStream("peoples.dat"));
	}


}
