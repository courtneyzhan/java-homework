/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSet13;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        while(true) {
            String userInput = keyboard.nextLine();
            if (userInput.equals("-1")) {
                break;
            }
            System.out.println(userInput);
        }
    }
}
