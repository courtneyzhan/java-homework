/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahomework.QuestionSet09;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userInput =  keyboard.nextLine();
        String anotherInput = keyboard.nextLine();
        if(userInput.length() > anotherInput.length()) {
            System.out.println(anotherInput.equalsIgnoreCase(userInput.substring((userInput.length() - anotherInput.length()))));
        } else {
            System.out.println(userInput.equalsIgnoreCase(anotherInput.substring((anotherInput.length() - userInput.length()))));
        }
    }
}
