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

import java.util.Scanner;

public class Main {

    public static GameSave GS = new GameSave();
    public static Scanner in = new Scanner(System.in);
    public static String question;

    public static String name;
    public static String user = "";

    public static void main(String[] args) {

        question = GS.LoadGame();
        name = GS.LoadName();
        //Game Loop
        while (true) {

            if (user.equalsIgnoreCase("exit")){
                System.out.println("Closing game.");
                System.exit(0);
            }else{
                switch (question) {
                    case "0":
                        System.out.println("Story...\n\nWhat is your name?");
                        question = "1";
                        break;

                    case "1":
                        user = in.next();
                        name = user;
                        question = "1A";
                        GS.SaveName(name);
                        GS.SaveGame("1A");
                        break;

                    case "1A":
                        System.out.println("Are you sure that is your name?\n[1]Yes\n[2]No");
                        question = "2";
                        break;

                    case "2":
                        switch (user = in.next()) {
                            case "1":
                                question = "2A";
                                GS.SaveGame(question);
                                break;

                            case "2":
                                System.out.println("\n\n");
                                question = "0";
                                break;
                            default:
                                System.out.println("\nInput not accepted, try again.");
                                question = "1A";
                                break;
                        }
                        break;

                    case "2A":
                        System.out.println("Hello, " + name + "\n[1]Hello...\n[2]Who the hell are you?");
                        question = "3";
                        break;
                    case "3":                      
                }
            }


        }

    }
}