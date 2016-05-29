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
public class Question4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        int number = keyboard.nextInt();
        String shortWord = word.substring(word.length() - number);
        for (int i = 0; i < number; i++) {
            System.out.print(shortWord);
        }
        System.out.println("");
    }
}
