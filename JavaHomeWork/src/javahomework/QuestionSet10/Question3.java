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
public class Question3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstWord = keyboard.nextLine();
        String secondWord = keyboard.nextLine();
        if(firstWord.substring(firstWord.length() - 1).equalsIgnoreCase(secondWord.substring(0,1))) {
            System.out.print(firstWord.concat(secondWord.substring(1)));
        } else {
            System.out.print(firstWord.concat(secondWord));
        }
    }
}
