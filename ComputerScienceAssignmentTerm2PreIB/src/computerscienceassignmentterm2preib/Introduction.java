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
public class Introduction {

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
        System.out.println("What would you like to be called?");
        String userName = keyboard.nextLine();
        delayedPrint(22, userName + " I can't even believe you fell for the candy trick. Weren’t you ever told not to trust strangers with candy?\n"
                + " \n"
                + "Anyway, you're trapped.\n"
                + "In this room.\n"
                + "Forever.\n"
                + " \n"
                + "Unless you find my key of course. Which you won't.\n"
                + "Go on. Make yourself at home. You're going to be here for a while.");
        delayedPrint(20, "...\nYou probably don't know how to do anything...\nType 'help'. Go on.");
        String helpList = "Look - blahblahblah"; //pre define this method
        System.out.println(helpList); //print out help list
        delayedPrint(20, "There you go, a list of actions which you can do. \nNow get comfortable and relax... \nand don't try to escape.");
        //game begins
    }

}
