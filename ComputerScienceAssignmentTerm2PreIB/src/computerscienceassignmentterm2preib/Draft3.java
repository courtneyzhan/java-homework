/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerscienceassignmentterm2preib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
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

    public static String inventory(boolean hasKey, boolean hasCatFood, boolean catFed) { //inventory
        List inventory = new ArrayList();
        if (hasKey == true) {
            inventory.add("key");        
        }
        if (hasCatFood == true) {
            inventory.add("food");   
            if (catFed==true) {
                inventory.remove("food");
            }
        }
        return Arrays.toString(inventory.toArray());
    }
    
    public static String examineObject(String object, boolean hasKey, boolean catFed, int boxWithKey) {
        Map<String, String> examine = new HashMap();
        //SIGNIFICANT OBJECTS
        //door
        if (hasKey == true) {
            examine.put("door", "You have the key...let's leave...");
        } else {
            examine.put("door", "The door is metal with a small keyhole set under the handle.\nYou pull at the handle...it doesn't give way.\nYou should probably find a key to get out...");
        }
        //table/desk
        examine.put("table", "There are a few things strewn about the table.\nSome loose pencils and a pad of paper are in the centre.\nNear the back of the desk there is an eclectic assortment of knick-knacks near the back of the desk.");
        examine.put("desk", "There are a few things strewn about the table.\nSome loose pencils and a pad of paper are in the centre.\nNear the back of the desk there is an eclectic assortment of knick-knacks near the back of the desk.");
        //bookshelf
        examine.put("bookshelf", "Whoever owns this place is a rather avid reader. The bookshelf is filled with books.\nA lot of the books are classics.\nIn particular, 'The Great Gatsby' and 'To Kill a Mockingbird' catch your eye.\nAnyway, there's a book called 'The Escape' (by Robert Muchamore).\nWell at least you can kill time here by reading...");
        examine.put("book-shelf", "Whoever owns this place is a rather avid reader. The bookshelf is filled with books.\nA lot of the books are classics.\nIn particular, 'The Great Gatsby' and 'To Kill a Mockingbird' catch your eye.\nAnyway, there's a book called 'The Escape' (by Robert Muchamore).\nWell at least you can kill time here by reading...");
        examine.put("book shelf", "Whoever owns this place is a rather avid reader. The bookshelf is filled with books.\nA lot of the books are classics.\nIn particular, 'The Great Gatsby' and 'To Kill a Mockingbird' catch your eye.\nAnyway, there's a book called 'The Escape' (by Robert Muchamore).\nWell at least you can kill time here by reading...");
        //beanbag
        examine.put("beanbag", "There's a cat sitting on the beanbag. Other than that, there is nothing special about it.");
        examine.put("bean-bag", "There's a cat sitting on the beanbag. Other than that, there is nothing special about it.");
        examine.put("beanbag", "There's a cat sitting on the beanbag. Other than that, there is nothing special about it.");
        //cat
        examine.put("cat", "It's a tabby, it looks unhappy...\nmaybe because it's sitting on that gold box.");
        //books
        examine.put("the great gatsby", "You attempt to read it but cannot get past the 100 pages of introduction.\nYou put it back on the shelf.");
        examine.put("great gatbsy", "You attempt to read it but cannot get past the 100 pages of introduction.\nYou put it back on the shelf.");
        examine.put("gatsby", "You attempt to read it but cannot get past the 100 pages of introduction.\nYou put it back on the shelf.");
        examine.put("to kill a mocking bird", "'This will be a good book' you think.\nAnd then you realise that the plot moves at a snail's pace.\nYou put it back on the shelf.");
        examine.put("to kill a mockingbird", "'This will be a good book' you think.\nAnd then you realise that the plot moves at a snail's pace.\nYou put it back on the shelf.");
        examine.put("to kill a mocking-bird", "'This will be a good book' you think.\nAnd then you realise that the plot moves at a snail's pace.\nYou put it back on the shelf.");
        examine.put("tkam", "'This will be a good book' you think.\nAnd then you realise that the plot moves at a snail's pace.\nYou put it back on the shelf.");
        examine.put("the escape", "You open the cover...\nThere's a hole carved into the middle of the book.\nWhat fiend would do this to a book?\n...\nAnyway there's a silver box in the hole...maybe it's important?");
        //silver box (dependent on userInput)
        examine.put("silver box", "It's shiny and elaborate. You try to open it, however it is locked.\nThere's a 4-digit combination lock\nDo you want to enter the code? (Y/N)");
        //gold box 
        if (catFed == false) {
            examine.put("gold box", "You try to reach for the box...\nThe cat scratches you and begins hissing.\nMaybe you should find a way to distract the cat...");
        } else if (boxWithKey == 3) {
            examine.put("gold box", "You try to reach for the box...\nThe cat is busy contentedly eating _GRAPHS_. The box opens to reveal a key!");
        } else {
            examine.put("gold box", "You try to reach for the box...\nThe cat is busy contentedly eating _GRAPES_. The box opens to reveal a sticky note.");
        }
        //sticky note (for gold box)
        examine.put("sticky note", "It reads: 'Git rekt son'");
        //wooden box
        examine.put("wooden box", "There seems to be a puzzle required to open the box. Would you like to try it? (Y/N)");

        //box
        examine.put("box", "Please specify what kind of box");

        //NOT SIGNIFICANT OBJECTS
        //chair
        examine.put("chair", "It's just an ordinary chair. It doesn't look very comfortable though.");
        examine.put("pencils", "There are just standard 4B pencils. They are a bit blunt, but other than that, there is nothing special about them");
        examine.put("pencil", "There are just standard 4B pencils. They are a bit blunt, but other than that, there is nothing special about them");
        examine.put("paper", "It's a standard pad of paper. Nothing much to see here");
        examine.put("pad of paper", "It's just a standard pad of paper. Nothing much to see here.");
        if (object == null) { //in the case where the user doesn't specify the object
            return "Please specify an object to examine.";
        } else if (examine.get(object) == null) { //in the case where the object isn't listed.
            return "There's not much to see about this " + object;
        }
        return examine.get(object);
        //if examine doesn't have object then say blah
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean hasKey = false;
        boolean puzzleStart = false;
        int boxWithKey = 3;
        boolean hasCatFood = false;
        boolean catFed = true;
        String helpList = "\nLook - Will give you an overview of what is in the room\nExamine - Will examine an object in detail\nInventory - Will display all items you have in possession\nQuit - Quit the game.\n"; //pre define this method        
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
            switch (command.toLowerCase()) {
                case "help":
                    System.out.println(helpList);
                    break;
                case "look":
                    System.out.println(roomDescription(hasKey));
                    break;
                case "inventory":
                    System.out.println(inventory(hasKey, hasCatFood, catFed));
                    break;
                case "examine":
                    if (rest == null) {

                    }
                    else if (rest.equalsIgnoreCase("wooden box")) {
                        System.out.println(examineObject("wooden box", hasKey, hasCatFood, boxWithKey));
                        System.out.print("> ");
                        String startPuzzle = keyboard.nextLine();
                        if (startPuzzle.equalsIgnoreCase("Y")) {
                            System.out.println("The puzzle reads:\nTwo men are moving boxes from one floor to another. Tim can take two boxes but takes one minute, Bob can take one box and takes 30 seconds.\nTim and Bob take the same amount of time coming down as going up.\nWith both of them combined, how long (in minutes) does it take to move 7 boxes? (Answer only in integers)");
                            while (true) {
                                System.out.print("> ");
                                int userAnswer = keyboard.nextInt();
                                System.out.println("You enter " + userAnswer + " into a small dial pad set into the box...");
                                if (userAnswer == 7) {
                                    if (boxWithKey == 3) {
                                        System.out.println("Correct! The box opens to reveal a key. You take it and put it in your pocket.");
                                        hasKey = true;
                                    } else {
                                        System.out.println("Correct! The box opens to reveal a cute cat figurine.");
                                    }
                                    break;
                                } else {
                                    System.out.println("No dice.\nThe box is still locked... Let's try this again.");
                                }
                            }
                        } else if (startPuzzle.equalsIgnoreCase("N")) {
                            System.out.println("'I'll come back to this later...'");
                        }
                    } else if (rest.equalsIgnoreCase("silver box")) {
                        System.out.println(examineObject("silver box", hasKey, hasCatFood, boxWithKey));
                        System.out.print("> ");
                        String enterCode = keyboard.nextLine();
                        if (enterCode.equalsIgnoreCase("Y")) {
                            while (true) {
                                String userCode = keyboard.nextLine();
                                if (userCode.equals("0123")) {
                                    System.out.println("Correct");
                                    if (boxWithKey == 2) {
                                        System.out.println("The box opens to reveal a key. You take it and put it in your pocket.");
                                        hasKey = true;
                                    } else {
                                        System.out.println("The box opens to reveal a cute cat figurine.");
                                    }
                                    break;
                                } else {
                                    System.out.println("Incorrect! Try again.");
                                }
                            }
                        }
                    }
                    System.out.println(examineObject(rest, hasKey, hasCatFood, boxWithKey));
                    break; //should also return the flag and exit while loop to start playing the puzzle. 
                case "quit":
                    Runtime.getRuntime().exit(0);
                    break; //lol is this necessary

                default:
                    System.out.println("I don't understand that command. Try again.");
                    break;
            }
            if (puzzleStart) {
            }
        }
        //System.out.println(roomDescription(hasKey));
    }

}
