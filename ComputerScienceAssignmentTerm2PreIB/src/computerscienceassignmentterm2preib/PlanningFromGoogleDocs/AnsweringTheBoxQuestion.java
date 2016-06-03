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
public class AnsweringTheBoxQuestion {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
	boolean hasKey = false;
        while (true) {
            System.out.println("How many times does the numeral '1' appear in the numbers 1 to 120? ");
            int userAnswer = keyboard.nextInt();
            if (userAnswer == 53) {
                System.out.println("Correct"); //change flag to true, obtain the key, add key to inventory
		hasKey = true; 
                break;
            } else {
                System.out.println("Incorrect! Try again."); //there is currently no way to exit unless you input the correct answer. 
            }
        }
    }
}
