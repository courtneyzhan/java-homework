/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package computerscienceassignmentterm2preib;
import java.util.Scanner;

/**
 *
 * @author Courtney Zhan
 */
public class Draft3 {

    public static void delayedPrint(int delay, String s) { //a method to delay the print speed per line.
        try {
            for (char c : s.toCharArray()) {
                System.out.print(c);  // print characters without newline
                Thread.sleep(delay);  // wait for some milli seconds
            }
        } catch (InterruptedException e) {
        }
        System.out.println(); // finally, add a line break
    }

    public static String roomDescription(boolean hasKey) { //a room description
        if (hasKey == true) {
            return "you may exit";
        } else {
            return "In the right corner there is an old table with a chair.\n"
                    + "In the left corner is a bean bag. It has a cute cat print!\n"
                    + "Next to you there is a book shelf.\n"
                    + "Behind you is a door. You know it's locked. Maybe a key will unlock it...";
        }
    }

    public static String inventory(boolean hasKey) {
        if (hasKey == true) {
            return "key";
        } else {
            return "There's nothing here";
        }
    }

    public static String examineObject(String object, boolean hasKey) {
        switch (object) {
            //case null:
            //return "You need to specify an object to examine";
            case "table":
                return "There are a few things strewn about the table; \na few loose pencils and a blank pad of paper. \nThere is also an eclectic assortment of knick-knacks near the back of the desk. \nUnderneath the table there is a set of drawers.";

            //all the knick knacks
            case "knick-knacks":
                return "These seem like souvenirs and most of them are well worn.\n"
                        + "To the left are a few, chipped shells painted in strange reds which still smell like the sea...\n"
                        + "To the right, there are small whiteÖ rocks? It's impossible to tell what they really are.\n"
                        + "In the centre, there is a small wooden box. It's surface is splintered and aged.";
            case "knick knacks":
                return "These seem like souvenirs and most of them are well worn.\n"
                        + "To the left are a few, chipped shells painted in strange reds which still smell like the sea...\n"
                        + "To the right, there are small whiteÖ rocks? It's impossible to tell what they really are.\n"
                        + "In the centre, there is a small wooden box. It's surface is splintered and aged.";
            case "knickknacks":
                return "These seem like souvenirs and most of them are well worn.\n"
                        + "To the left are a few, chipped shells painted in strange reds which still smell like the sea...\n"
                        + "To the right, there are small whiteÖ rocks? It's impossible to tell what they really are.\n"
                        + "In the centre, there is a small wooden box. It's surface is splintered and aged.";

            //all the boxes
            case "box":
                return "box has a puzzle";
            case "old box":
                return "box has a puzzle"; //need a kind of flag to start the game. 
            case "small box":
                return "*smol";
            case "wooden box":
                return "blah";

            case "drawers":
                return "Holding your breath you pull open the drawers...\nIt's not locked like you expected. However it doesn't hold anything either. \nDisappointed, you push the drawer back into place.";

            //all the paper pads
            case "paper":
                return "Just a standard pad of paper. Nothing much to see here.";
            case "pad":
                return "Just a standard pad of paper. Nothing much to see here.";
            case "pad of paper":
                return "Just a standard pad of paper. Nothing much to see here.";

            case "pencils":
                return "Just some standard 4B pencils. They are blunt and other than that, there is nothing special about them.";

            case "beanbag":
                return "look comfy and the cats are cute. but no time to waste";
            case "bean bag":
                return "look comfy and the cats are cute. But no time to waste";
            case "bean-bag":
                return "look comfy and the cats are cute. But no time to waste";

            case "door":
                if (hasKey == true) {
                    return "Do you wish to exit?";
                } else {
                    return "You pull at the handle and bang at the door. It doesn't give way and no one hears. \nAt least that's what it seems like. \nIf you're going to get out, you're going to need a key.";
                }
            default:
                return "There's not much to see about this " + object;
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean hasKey = false;
        boolean puzzleStart = false;

        String helpList = "\nLook - Will give you an overview of what is in the room\nExamine - Will examine and object in detail\nInventory - Will display all items you have in possession\nQuit - Quit the game.\n"; //pre define this method        
        System.out.println("What would you like to be called?");
        System.out.print("> ");
        String userName = keyboard.nextLine();
        delayedPrint(22, userName + ", I can't even believe you fell for the candy trick. Weren't you ever told not to trust strangers with candy?\n"
                + " \n"
                + "Anyway, you're trapped.\n"
                + "In this room.\n"
                + "Forever.\n"
                + " \n"
                + "Unless you find my key of course. Which you won't.\n"
                + "Go on. Make yourself at home. You're going to be here for a while.");
        delayedPrint(20, "...\nYou probably don't know how to do anything...\nType 'help'. Go on.");
        while (true) { //asking the user to type help
            System.out.print("> ");
            String userInput = keyboard.nextLine();
            if (userInput.trim().equalsIgnoreCase("help")) {
                System.out.println(helpList); //print out help list
                break;
            } else {
                System.out.println("Type 'help'. Go on."); //will keep prompting user to input 'help'. 
            }
        }
        delayedPrint(20, "There you go, a list of actions which you can do. \nNow get comfortable and relax... \nand don't try to escape.");
        //game begins
        //Will we have a tutorial on how to examine objects? E.g. examine the door "It's locked."?
        while (true) {
            System.out.print("> ");
            String userInput = keyboard.nextLine();
            userInput = userInput.trim();

            int cmdPos = userInput.indexOf(" ");
            String command = null;
            String rest = null;

            if (cmdPos < 0) { // not found
                command = userInput;
            } else {
                command = userInput.substring(0, cmdPos);
                rest = userInput.substring(cmdPos + 1);
            }
            if (rest == null) {
                System.out.println("Please specify an object to examine.");
            } else {
                switch (command.toLowerCase()) {
                    case "help":
                        System.out.println(helpList);
                        break;
                    case "look":
                        System.out.println(roomDescription(hasKey));
                        break;
                    case "inventory":
                        System.out.println(inventory(hasKey));
                        break;
                    case "examine":
                        if (rest.equals("box") || rest.equals("wooden box") || rest.equals("small box") || rest.equals("old box")) {
                            System.out.println(examineObject(rest, hasKey));
                            while (true) {
                                System.out.println("How many times does the numeral '1' appear in the numbers 1 to 120? ");
                                System.out.print("> ");
                                int userAnswer = keyboard.nextInt();
                                if (userAnswer == 53) {
                                    puzzleStart = true;
                                    System.out.println("Correct"); //change flag to true, obtain the key, add key to inventory
                                    hasKey = true;
                                    break;
                                } else {
                                    System.out.println("Incorrect! Try again."); //there is currently no way to exit unless you input the correct answer. 
                                }
                            }
                            break;
                        } else if (hasKey == true && rest.equals("door")) {
                            System.out.println(examineObject(rest, hasKey));
                            System.out.print("> ");
                            String doYouWantToExit = keyboard.nextLine();
                            if (doYouWantToExit.equalsIgnoreCase("Y")) {
                                System.out.println("You exit");
                                Runtime.getRuntime().exit(0);
                                break;
                            } else if (doYouWantToExit.equalsIgnoreCase("N")) {
                                System.out.println("You don't exit");
                            } else {
                                System.out.println("??");
                            }
                        } else {
                            System.out.println(examineObject(rest, hasKey));
                        }
                        break; //should also return the flag and exit while loop to start playing the puzzle. 
                    case "quit":
                        Runtime.getRuntime().exit(0);
                        break;

                    default:
                        System.out.println("I don't understand that command. Try again.");
                        break;
                }
            }
            if (puzzleStart) {
            }
        }
        //System.out.println(roomDescription(hasKey));
    }

}
