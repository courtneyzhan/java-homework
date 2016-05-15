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
public class Question2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userInput = keyboard.nextLine();
        int index = userInput.indexOf("b");
        if(userInput.substring(index+2, index+3).equals("b")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
