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
import java.util.Properties;

public class GameSave {

    public static Properties prop = new Properties();

    public void SaveGame(String point){
        try{
            prop.setProperty("Save_Point", point);
            prop.store(new FileOutputStream("saveData.prop"), null);
        }catch (IOException e){

        }
    }

    public void SaveName(String playerName){
        try{
            prop.setProperty("Save_Name", playerName);
            prop.store(new FileOutputStream("saveData.prop"), null);
        }catch (IOException e){

        }
    }

    public String LoadGame(){
        return loadString("saveData.prop", "Save_Game", "0");
    }

    public String LoadName(){
        return loadString("saveData.prop", "Save_Name", "");
    }
    
    public String loadString(String propertyFileName, String key, String defaulted) {
    	String result = "";
        try{
            prop.load(new FileInputStream(propertyFileName));
            result = prop.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
            prop.setProperty("Save_Point", "0");

            try{
               prop.load(new FileInputStream(propertyFileName));
               result = prop.getProperty(key);
            }catch (IOException exe){
                exe.printStackTrace();
            }
        }
        return result;
    }

}