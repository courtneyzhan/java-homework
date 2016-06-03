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
public class IntroductionAndTutorial {

    public static void delayedPrint(int delay, String s) {
        try {
            for (char c : s.toCharArray()) {
                System.out.print(c);  // print characters without newline
                Thread.sleep(delay);  // wait for some milli seconds
            }
        } catch (InterruptedException e) {
        }
        System.out.println(); // finally, add a line break
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String helpList = "Look - Will give you an overview of what is in the room\nExamine - Will examine and object in detail\nInventory - Will display all items you have in possession\nQuit - Quit the game."; //pre define this method
        String[] inventory = new String[3]; //max three objects
        System.out.println("What would you like to be called?");
        System.out.print("> ");
        String userName = keyboard.nextLine();
        delayedPrint(22, userName + " I can't even believe you fell for the candy trick. Weren't you ever told not to trust strangers with candy?\n"
                + " \n"
                + "Anyway, you're trapped.\n"
                + "In this room.\n"
                + "Forever.\n"
                + " \n"
                + "Unless you find my key of course. Which you won't.\n"
                + "Go on. Make yourself at home. You're going to be here for a while.");
        delayedPrint(20, "...\nYou probably don't know how to do anything...\nType 'help'. Go on.");
        while (true) { //asking the user to type help
            String userInput = keyboard.nextLine();
            if (userInput.equalsIgnoreCase("help")) {
                System.out.println(helpList); //print out help list
                break;
            } else {
                System.out.println("Type 'help'. Go on."); //will keep prompting user to input ‘help’. 
            }
        }
        delayedPrint(20, "There you go, a list of actions which you can do. \nNow get comfortable and relax... \nand don't try to escape.");
        //game begins
        //Will we have a tutorial on how to examine objects? E.g. examine the door "It's locked."?
    }
}
