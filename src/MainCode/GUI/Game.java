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

import MainCode.Items.Inventory;
import MainCode.Monster.Player;
import MainCode.Rooms.Room;


//Might move this into MainMenu. Maybe...TBD

public class Game
{
	ObjectOutputStream output;
	ObjectInputStream input;
	
	Player player;
	Room room;
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
