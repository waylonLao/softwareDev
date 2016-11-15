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

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


//Might move this into MainMenu. Maybe...TBD

public class Game
{
	ObjectOutputStream output;
	ObjectInputStream input;
	
	public void saveGame() throws FileNotFoundException, IOException{
		
		output = new ObjectOutputStream(new FileOutputStream("gameSave.dat"));
		
	}
	
	public void loadGame(){
		
		
	}
	
	
}
