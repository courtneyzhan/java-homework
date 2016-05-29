/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSet14;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Question5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstWord = keyboard.nextLine();
        String secondWord = keyboard.nextLine();
        int number = keyboard.nextInt();
        for (int i = 0; i < number-1; i++) {
            System.out.print(firstWord + secondWord);
        }
        System.out.print(firstWord);
        System.out.println("");
    }
 
}
