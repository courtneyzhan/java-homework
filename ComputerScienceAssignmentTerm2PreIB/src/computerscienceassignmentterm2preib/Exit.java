/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerscienceassignmentterm2preib;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exit {

    public static String roomDescription(boolean openBox) {
        if (openBox == true) {
            return "The door swings open. The outside world is blinding. Do you wish to exit?";
        } else {
            return "You find yourself in a room. To the left is a table and a chair. In front of you is a bed and there is a locked door to the right. Maybe you should find the key so you can get out.";
        }
    }
/*
  Player begins in a room
	Command list given
	Player look at the door
	Player look at the desk
	Do something with the desk
		Find box? Open box
		Do a puzzle? Professor layton style? Complete puzzle
	Obtain the key
	Go to door and exit the room
  
*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What would you like to be called?"); //ask for the user's name
        String userName = keyboard.nextLine();
        System.out.println("Backstory"); //give the user backstory and context
        boolean hasKey = false; //initialise a flag for if the user has the key in possession. when found should turn to true

        while (true) {
            System.out.println(roomDescription(hasKey));
            
            System.out.print("what is 1+0 = ");
            while(true) {
                String userInput = keyboard.nextLine();
                if (userInput.equals("1")) {
                    hasKey = true;
                    break;
                } else {
                    System.out.println("Incorrect, try again");
                }
            }
            if (hasKey == true) {
                 System.out.println(roomDescription(hasKey));

                String wantToExit = keyboard.next();
                if (wantToExit.equalsIgnoreCase("Y")) {
                    System.out.println("you exit");
                    Runtime.getRuntime().halt(0);
                } else {
                    continue;
                }
            }
        }
    }

}
