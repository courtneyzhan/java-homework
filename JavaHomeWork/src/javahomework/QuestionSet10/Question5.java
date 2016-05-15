/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahomework.QuestionSet10;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Question5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userInput = keyboard.nextLine();
        String shortUserInput = userInput.substring(2);
        if((userInput.charAt(0)) == 'a') {
           System.out.println("a" + shortUserInput);
        } else if((userInput.charAt(1)) == 'b') {
           System.out.println("b" + shortUserInput);
        } else {
            System.out.println(shortUserInput);
        }
    }
}
