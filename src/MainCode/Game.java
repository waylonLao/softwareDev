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

package MainCode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import MainCode.Items.*;
import MainCode.Monster.*;
import MainCode.Rooms.*;

public class Game
{
	ObjectOutputStream outputs;
	static ObjectInputStream inputs;

	Player newPlayer;
	Room room;
	Inventory inv;


	public void newGame()
	{
		System.out.println("Welcome to Galaxy Explorer!");
		System.out.println("Please create a new character");
		System.out.println("Please type in your name:");
		this.room = new EngineRoom();
	}

	public void saveGame() throws FileNotFoundException, IOException
	{
		try {
			outputs = new ObjectOutputStream(new FileOutputStream("gameSave.dat"));
			outputs.writeObject(newPlayer);
			outputs.writeObject(room);
			outputs.writeObject(inv);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} finally {
			outputs.close();
		}
	}

	public void loadGame() //throws FileNotFoundException, IOException, ClassNotFoundException
	{
		try {
			inputs = new ObjectInputStream(new FileInputStream("gameSave.dat"));
			//Hard coding the toString, may need to change to loop
			System.out.println(inputs.readObject());
			System.out.println("|----------------------|");
			System.out.println(inputs.readObject());
			System.out.println("|----------------------|");
			System.out.println(inputs.readObject());

		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} finally {
			try {
				inputs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
