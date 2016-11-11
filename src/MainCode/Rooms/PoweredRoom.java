/**
 * Josh Tran
 * Date: Nov 9, 2016
 */
package MainCode.Rooms;

import java.util.ArrayList;

import MainCode.Items.ECell;

/**
 * @author Joshua Tran
 * Date: Nov 9, 2016
 */
public class PoweredRoom extends Room{
	
	private ArrayList<ECell> eCellArray = null;
	
	public PoweredRoom()
	{
		
	}

	/**
	 * @return the eCellArray
	 */
	public ArrayList<ECell> geteCellArray() {
		return eCellArray;
	}

	/**
	 * @param eCellArray the eCellArray to set
	 */
	public void seteCellArray(ArrayList<ECell> eCellArray) {
		this.eCellArray = eCellArray;
	}
	
	public void checkForECell()
	{
		if(eCellArray.contains(new ECell()))
		{
			setPowered(true);
			
		}
		else 
		{
			setPowered(false);
		}
	}
	
	public void addECell(ECell eCell)
	{
		eCellArray.add(eCell);
	}

}
