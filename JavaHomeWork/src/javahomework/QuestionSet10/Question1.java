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
public class Question1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userInput = keyboard.nextLine();
        String lastTwo = userInput.substring(userInput.length()-2);
        System.out.print(lastTwo + lastTwo + lastTwo);
    }
}
