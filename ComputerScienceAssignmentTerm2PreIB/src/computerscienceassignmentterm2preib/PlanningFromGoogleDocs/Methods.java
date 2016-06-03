/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerscienceassignmentterm2preib.PlanningFromGoogleDocs;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Methods {
    public static String roomDescription(boolean hasKey) {
        if (hasKey == true) {
            return "you may exit";
        } else {
            return "get the key";
        }
    }

    public static String inventory(boolean hasKey) {
        if (hasKey == true) {
            return "key";
        } else {
            return "There's nothing here";
        }
    }

    public static String examineObject(String object) {
        switch (object) {
            case "table":
                return "There are a few things strewn about the table; a few loose pencils and a blank pad of paper. There is also an eclectic assortment of knick-knacks near the back of the desk. Underneath the table  is a set of draws.";

            //all the knick knacks
            case "knick-knacks":
                return "These seem like souvenirs and most of them are well worn.\n"
                        + "To the left are a few, chipped shells painted in strange reds which still smell like the sea...\n"
                        + "To the right, there are small white… rocks? It's impossible to tell what they really are.\n"
                        + "In the centre, there is a small wooden box. It's surface is splintered and aged.";
            case "knick knacks":
                return "These seem like souvenirs and most of them are well worn.\n"
                        + "To the left are a few, chipped shells painted in strange reds which still smell like the sea...\n"
                        + "To the right, there are small white… rocks? It's impossible to tell what they really are.\n"
                        + "In the centre, there is a small wooden box. It's surface is splintered and aged.";
            case "knickknacks":
                return "These seem like souvenirs and most of them are well worn.\n"
                        + "To the left are a few, chipped shells painted in strange reds which still smell like the sea...\n"
                        + "To the right, there are small white… rocks? It's impossible to tell what they really are.\n"
                        + "In the centre, there is a small wooden box. It's surface is splintered and aged.";

            //all the boxes
            case "box":
                return "box has a puzzle";
            case "old box":
                return "box has a puzzle";
            case "small box":
                return "*smol";
            case "wooden box":
                return "blah";

            case "drawers":
                return "Holding your break you pull open the drawers...\nIt's not locked like you expected. However it doesn't hold anything either. Disappointed you push the drawer back into place.";

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

            default:
                return "There's not much to see about this " + object;
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean hasKey = false;
        String helpList = "Look - Will give you an overview of what is in the room\nExamine - Will examine and object in detail\nInventory - Will display all items you have in possession\nQuit - Quit the game."; //pre define this method

        String[] inventory = new String[1];

        while (true) {
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
                    System.out.println(inventory(hasKey));
                    break;
                case "examine":
                    System.out.println(examineObject(rest));
                    break;
                default:
                    System.out.println("I don't understand that command. Try again.");
                    break;
            }
        }
    }
}
