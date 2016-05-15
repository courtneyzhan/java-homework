/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSet08;
import java.util.Scanner;
/**
 *
 * @author Courtney Zhan
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input a string: ");
        String word = keyboard.nextLine();
        if (word.length() < 2) {
            System.out.println(word);
        } else {
            System.out.print(word.substring(2)+word.substring(0,2));
        }
    }
}
