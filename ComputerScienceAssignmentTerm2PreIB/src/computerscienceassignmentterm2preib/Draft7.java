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
import java.util.Random;

/**
 *
 * @author Courtney Zhan
 */
public class Draft7 {

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
            return "The room is carpeted. In the right corner there is an old table with a chair.\n"
                    + "In the left corner is a bean bag. It has a cute cat print!\n"
                    + "Next to it is a lamp.\n"
                    + "Next to you there is a book shelf.\n"
                    + "The white walls are littered with many objects.\n"
                    + "There is a broken clock next to a phone, both of which are under a set of curtains.\n"
                    + "Inbeded into the wall is a fire place. It is out\n"
                    + "There is also a picture hanging there\n"
                    + "There is a plant hanging from the ceiling where the light should be.\n"
                    + "Behind you is a door. You know it's locked. Maybe a key will unlock it...";
        }
    }

    public static String inventory(boolean hasKey, boolean hasCatFood, boolean catFed, boolean hasSpade) { //inventory
        List inventory = new ArrayList();
        if (hasKey == true) {
            inventory.add("key");
        }
        if (hasCatFood == true) {
            inventory.add("corn");
            if (catFed == true) {
                inventory.remove("corn");
            }
        }
        if (hasSpade == true) {
            inventory.add("spade");
        }
        return Arrays.toString(inventory.toArray());
    }

    public static String examineObject(String object, boolean hasKey, boolean catFed, boolean hasSpade, int boxWithKey, String userName, String hour, String min) {
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
        //knickknacks
        examine.put("knick-knacks", "They seem like souvenirs and most of them are well worn. \n"
                + "To the left of the group are a few, chipped shells painted in strange reds which still smell like the sea;\n"
                + "To the right, there are small white… rocks? It's impossible to tell what they really are.\n"
                + "In the centre, there is a small wooden box. It's surface is splintered and aged.");
        examine.put("knick knacks", "They seem like souvenirs and most of them are well worn. \n"
                + "To the left of the group are a few, chipped shells painted in strange reds which still smell like the sea;\n"
                + "To the right, there are small white… rocks? It's impossible to tell what they really are.\n"
                + "In the centre, there is a small wooden box. It's surface is splintered and aged.");
        examine.put("knickknacks", "They seem like souvenirs and most of them are well worn. \n"
                + "To the left of the group are a few, chipped shells painted in strange reds which still smell like the sea;\n"
                + "To the right, there are small white… rocks? It's impossible to tell what they really are.\n"
                + "In the centre, there is a small wooden box. It's surface is splintered and aged.");
        //secret passage
        examine.put("secret passage", "What secret passage. There is definitely  no secret passage here... It's not like if you go to the shelf and pull the book called 'Batman is Awesome' that you will be able to escape or anything...");
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
            examine.put("gold box", "You try to reach for the box...\nThe cat is busy contentedly eating corn. The box opens to reveal a key!");
        } else {
            examine.put("gold box", "You try to reach for the box...\nThe cat is busy contentedly eating corn. The box opens to reveal a sticky note.");
        }
        //sticky note (for gold box)
        examine.put("sticky note", "It reads: 'Git rekt son'");
        //wooden box
        examine.put("wooden box", "There seems to be a puzzle required to open the box. Would you like to try it? (Y/N)");

        //box
        examine.put("box", "Please specify what kind of box");

        //clock
        examine.put("clock", "The clock it's self is strange. Despite being an anolog clock, it seems to display 24hr time.\nAnyway, it's broken, and the hands are forever stuck at " + hour + ":" + min + ". \nYou try to rewind the hands however upon flipping over the clock there is no dial to change the time.");
        //spade
        if (hasSpade == false) {
            examine.put("plant", "Eh… Are you sure you want to touch that?\nIt's definitely unhygienic.\nIf I ((((were)))) you, I wouldn't use my hands to do that.");
        } else {
            examine.put("plant", "Eh… you probably shouldn't touch that.\nLuckily you found a trusty spade!\nNow you can toil in dat soil as much as you want!");
        }
//NOT SIGNIFICANT OBJECTS
        //chair
        if (hasSpade == false) {
            examine.put("chair", "It's just an ordinary chair. It doesn't look very comfortable though. There's a spade on the chair. You decide to take it.");
        } else {
            examine.put("chair", "It's just an ordinary chair. It doesn't look very comfortable though.");
        }

        examine.put("pencils", "There are just standard 4B pencils. They are a bit blunt, but other than that, there is nothing special about them");
        examine.put("pencil", "There are just standard 4B pencils. They are a bit blunt, but other than that, there is nothing special about them");
        examine.put("paper", "It's a standard pad of paper. Nothing much to see here");
        examine.put("pad of paper", "It's just a standard pad of paper. Nothing much to see here.");
        examine.put("picture", "It's a picture of some random family at the park. They seem to be having a good time.\n There is nothing interesting to see here");
        examine.put("lamp", "The lamp is on and is casting a green light on it's surroundings.\n It dosen't look like you can turn it of anywhere and on closer inspection, it doesn't seem to be plugged in.\n You decide that this is relatively so you move on.");
        examine.put("phone", "Wow, talk about retro! The phone looks like it is out of a 1950's advertisement. You could try to 'call' someone on it.");
        examine.put("folder", "Gotta love that classic manilla folder. So non-descript, so beautiful. There seems to some documents in it.");
        examine.put("documents", "Stalker alert much! The folder just seems to be filled with random peoples personal information.\n Hey! there's one in there about you! There isn't much information though.\n It just says " + userName);
        examine.put("curtains", "There dosn't seem to be any light coming through the curtains.\n However this is probably because they are pitch black and look rather thick\n You probably could 'open' them");
        examine.put("carpet", "The carpet is an ugly red.\n there isn't much else to see here.");
        examine.put("fire place", "This thing clearly hasn't been used for a while.\n What used to be logs are now just ashes.\n There is a chimney heading upwards and a manilla folder on the mantel.");
        examine.put("chimney", "You can hear voices echoing down the chimney shaft. There seems to be light at the end of it.\n You could probably try to 'climb' the chimney...");

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
        boolean hasSpade = false;
        Random randomGenerator = new Random();
        int boxWithKey = randomGenerator.nextInt(3) + 1;
        boolean hasCatFood = false;
        boolean catFed = false;
        boolean woodenBoxOpened = false;
        boolean silverBox = false;
        boolean goldBox = false;
        int speed = 0;
        int tempMin = randomGenerator.nextInt(60);
        String min = "";
        int tempHour = randomGenerator.nextInt(24);
        String hour = "";
        if (tempMin <= 10) {
            min = "0" + tempMin;
        } else {
            min = "" + tempMin;
        }
        if (tempHour <= 10) {
            hour = "0" + tempHour;
        } else {
            hour = "" + tempHour;
        }
        String helpList = "\nLook - Will give you an overview of what is in the room\nExamine - Will examine an object in detail\nInventory - Will display all items you have in possession\nQuit - Quit the game."; //pre define this method
        System.out.println("What text speed would you like?\nThere is [slow], [medium] (recomended), [fast]. \nIf you do not enter anything, the default will be between slow and medium. Press enter for the default.");
        System.out.print("> ");
        String text = keyboard.nextLine();
        switch (text.toLowerCase()) {
            case "slow":
                speed = speed + 30;
                break;
            case "medium":
                speed = speed + 25;
                break;
            case "fast":
                speed = speed + 10;
                break;
            default:
                speed = speed + 15;
                break;
        }
        System.out.println("What would you like to be called?");
        System.out.print("> ");
        String userName = keyboard.nextLine();

        delayedPrint(speed, userName + ", I can't even believe you fell for the candy trick. Weren't you ever told not to trust strangers with candy?\n"
                + " \n"
                + "Anyway, you're trapped.\n"
                + "In this room.\n"
                + "Forever.\n"
                + " \n"
                + "Unless you find my key of course. Which you won't.\n"
                + "Go on. Make yourself at home. You're going to be here for a while.");
        delayedPrint(speed, "...\nYou probably don't know how to do anything...\nWould you like to do the tutorial? (Y/N)");
                //Type 'help'. Go on.
        System.out.print("> ");
        String startTutorial = keyboard.nextLine();
        if (startTutorial.equalsIgnoreCase("Y")) {
            delayedPrint(speed, "Start by typing 'help'.");
            while (true) { //asking the user to type help
                System.out.print("> ");
                String userInput = keyboard.nextLine();
                if (userInput.trim().equalsIgnoreCase("help")) {
                    delayedPrint(speed, helpList); //print out help list
                    delayedPrint(speed, "There are other functions as the game progresses.\n");
                    break;
                } else {
                    delayedPrint(speed, "Type 'help'. Go on."); //will keep prompting user to input 'help'.
                }
            }

            delayedPrint(speed, "There you go, a list of actions which you can do.\nLet's try to examine the door. You don't need to use unnecessary words like 'the', just use the keywords."); //\nNow get comfortable and relax... \nand don't try to escape.");
            while (true) { //asking the user to type examine door
                System.out.print("> ");
                String userInput = keyboard.nextLine();
                if (userInput.trim().equalsIgnoreCase("examine door")) {
                    delayedPrint(speed, examineObject("door", hasKey, hasCatFood, hasSpade, boxWithKey, userName, hour, min)); //print out the description for the door
                    break;
                } else {
                    delayedPrint(speed, "Type 'examine door'. Go on."); //will keep prompting user to input 'examine door'.
                }
            }
        }
            delayedPrint(speed, "\nNow get comfortable and relax..\nand don't try to escape.");//keywords to start the game

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
                rest = rest.toLowerCase();
            }
            switch (command.toLowerCase()) {
                case "help":
                    delayedPrint(speed, helpList);
                    break;
                case "look":
                    delayedPrint(speed, roomDescription(hasKey));
                    break;
                case "inventory":
                    delayedPrint(speed, inventory(hasKey, hasCatFood, catFed, hasSpade));
                    break;
                case "examine":
                    if (rest == null) {
                        delayedPrint(speed, "Please specify an object to examine");
                    } else if (rest.equals("chair") && hasSpade == false) {
                        delayedPrint(speed, "It's a small garden spade. Would you like to pick it up? (Y/N)");
                        System.out.print("> ");
                        String pickUpSpade = keyboard.nextLine();
                        if (pickUpSpade.equalsIgnoreCase("Y")) {
                            delayedPrint(speed, "You pick up the spade");
                            hasSpade = true;
                        } else {
                            delayedPrint(speed, "You decide it's not important and you leave it.");
                        }
                        break;
                    } else if (rest.equals("plant") && hasSpade == true) {
                        delayedPrint(speed, "Would you like to 'toil in dat soil' with your spade? (Y/N)");
                        System.out.print("> ");
                        String digThePlant = keyboard.nextLine();
                        if (digThePlant.equalsIgnoreCase("Y") && hasCatFood == false) {
                            delayedPrint(speed, "After a few seconds of digging, you uncover a cob of corn.\nWould you like to pick it up? (Y/N)");
                            System.out.print("> ");
                            String takeTheCorn = keyboard.nextLine();
                            if (takeTheCorn.equalsIgnoreCase("Y")) {
                                delayedPrint(speed, "You now have a corn...If I were you I'd hope there was a use for this.");
                                hasCatFood = true;
                                break;
                            } else {
                                delayedPrint(speed, "You decide it's not important and cover it back up with soil.");
                                break;
                            }
                        } else if (digThePlant.equalsIgnoreCase("Y") && hasCatFood == true) {
                            delayedPrint(speed, "After a few seconds of digging, you uncover nothing.");
                        } else {
                            delayedPrint(speed, "You decide it's not important so you leave it");
                        }
                        break;
                    } else if (rest.equalsIgnoreCase("wooden box")) {
                        if (!woodenBoxOpened) {
                            delayedPrint(speed, examineObject("wooden box", hasKey, hasCatFood, hasSpade, boxWithKey, userName, hour, min));
                            System.out.print("> ");
                            String startPuzzle = keyboard.nextLine();
                            if (startPuzzle.equalsIgnoreCase("Y")) {
                                while (true) {
                                    delayedPrint(speed, "The puzzle reads:\nTwo men are moving boxes from one floor to another. Tim can take two boxes but takes one minute, Bob can take one box and takes 30 seconds.\nTim and Bob take the same amount of time coming down as going up.\nWith both of them combined, how long (in minutes) does it take to move 7 boxes? (Answer only in integers)");
                                    System.out.print("> ");
                                    int userCode = Integer.parseInt(keyboard.nextLine());
                                    if (userCode == 7) {
                                        delayedPrint(speed, "Correct");
                                        if (boxWithKey == 1) {
                                            delayedPrint(speed, "The box opens to reveal a key. You take it and put it in your pocket.");
                                            woodenBoxOpened = true;
                                            hasKey = true;
                                            break;
                                        } else {
                                            System.out.println("The box opens to reveal a cute cat figurine. That's pretty much useless...Disappointed you put it back.");
                                            woodenBoxOpened = true;
                                        }
                                        break;
                                    } else {
                                        delayedPrint(speed, "Incorrect! Would you like to try again? (Y/N)");
                                        System.out.print("> ");
                                        String continueToEnterCode = keyboard.nextLine();
                                        if (continueToEnterCode.equalsIgnoreCase("Y")) {
                                            delayedPrint(speed, "Let's try this again.");
                                        } else {
                                            delayedPrint(speed, "You decide to come back to this later...");
                                            break;
                                        }
                                    }
                                }
                            } else {
                                delayedPrint(speed, "Clearly you are not that interested in this box. You decide to come back to it later.");
                                break;
                            }
                        } else {
                            delayedPrint(speed, "You have already opened this box and there is nothing interesting about it anymore...");
                        }
                        break;
                    } else if (rest.equalsIgnoreCase("silver box")) {
                        if (silverBox == false) {
                            delayedPrint(speed, examineObject("silver box", hasKey, hasCatFood, hasSpade, boxWithKey, userName, hour, min));
                            System.out.print("> ");
                            String enterCode = keyboard.nextLine();
                            if (enterCode.equalsIgnoreCase("Y")) {
                                while (true) {
                                    delayedPrint(speed, "Enter the code:");
                                    System.out.print("> ");
                                    String userCode = keyboard.nextLine();
                                    if (userCode.equals(hour + min)) {
                                        delayedPrint(speed, "Correct");
                                        if (boxWithKey == 2) {
                                            delayedPrint(speed, "The box opens to reveal a key. You take it and put it in your pocket.");
                                            silverBox = true;
                                            hasKey = true;
                                        } else {
                                            delayedPrint(speed, "The box opens to reveal a cute cat figurine. Angry and frustration overwhelm you and you throw it at the wall.\nIt shatters even though it's made of plastic.\n...I would advise therapy.");
                                            silverBox = true;
                                        }
                                        break;
                                    } else {
                                        delayedPrint(speed, "Incorrect! Would you like to try again? (Y/N)");
                                        System.out.print("> ");
                                        String continueToEnterCode = keyboard.nextLine();
                                        if (continueToEnterCode.equalsIgnoreCase("Y")) {
                                        } else {
                                            delayedPrint(speed, "You decide to find the code before returning...What objects in this room have something to do with numbers...");
                                            break;
                                        }
                                    }
                                }
                            } else if (enterCode.equalsIgnoreCase("N")) {
                                delayedPrint(speed, "You decide to come back to this box later...");
                                break;
                            } else {
                                delayedPrint(speed, "Clearly you are not that interested in this box. You decide to come back to it later.");
                                break;
                            }
                        } else {
                            delayedPrint(speed, "You have already opened this box and there is nothing interesting about it anymore...");
                        }
                        break;
                    } else if (rest.equalsIgnoreCase("gold box") && boxWithKey == 3) {
                        if (goldBox == false) {
                            hasKey = true;
                        } else {
                            delayedPrint(speed, "You've already opened the box and there is nothing of interest anymore...");
                        }
                        delayedPrint(speed, examineObject(rest, hasKey, hasCatFood, hasSpade, boxWithKey, userName, hour, min));
                        break; //should also return the flag and exit while loop to start playing the puzzle. 
                    } else {
                        delayedPrint(speed, examineObject(rest, hasKey, hasCatFood, hasSpade, boxWithKey, userName, hour, min));

                    }
                    break;
                case "quit":
                    Runtime.getRuntime().exit(0); //exit the program
                case "pull":
                    if (rest.equalsIgnoreCase("Batman is awesome")) {
                        delayedPrint(speed, "Wow, way to be lazy and not complete the game.\nWell done I guess that you win... cheater.\n");
                        // an ending needs to be put here... yep
                        break;
                    }
                    break;
                case "climb":
                    if (rest.equalsIgnoreCase("chimney")) {
                        delayedPrint(speed, "You try to climb the chimney.\n");
                        delayedPrint(speed, ".");
                        delayedPrint(speed, ".");
                        delayedPrint(speed, ".\n");
                        delayedPrint(speed, "Unfortunately, you are not a ninja.\nYour attempts to climb the chimney has ended in failure and all you have nothing to show for it.\n");
                        delayedPrint(speed, "Think next time!");
                    }
                    break;
                case "call":
                    delayedPrint(speed, "You try to call your " + rest + ".\n");
                    delayedPrint(speed, ".");
                    delayedPrint(speed, ".");
                    delayedPrint(speed, ".\n");
                    delayedPrint(speed, "It's not working. The phone must be disconnected.\n");
                    delayedPrint(speed, "I don't think you going to be able to talk to your " + rest + "while you are still in this room\n");
                    break;
                case "open":
                    if (rest.equalsIgnoreCase("curtains")) {
                        System.out.println("You try to open the curtains.\n");
                        delayedPrint(speed, ".");
                        delayedPrint(speed, ".");
                        delayedPrint(speed, ".\n");
                        delayedPrint(speed, "Turns out that there is not window behind these curtains. It's just more wall\n");
                        delayedPrint(speed, "You close them again");
                        break;
                    }
                    break;
                default:
                    System.out.println("I don't understand that command. Try again.");
                    break;
            } //switch case ends

        } //while loop ends
        //System.out.println(roomDescription(hasKey));
    } //main method ends

} //class ends
