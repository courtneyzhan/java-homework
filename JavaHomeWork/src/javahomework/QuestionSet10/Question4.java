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
public class Question4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstWord = keyboard.nextLine();
        String secondWord = keyboard.nextLine();
        //using if statement identify the smaller string
        if (firstWord.length() >= secondWord.length()) {
            firstWord = firstWord.substring(firstWord.length() - secondWord.length());
        } else {
            secondWord = secondWord.substring(secondWord.length() - firstWord.length());
        }
        System.out.println(firstWord.concat(secondWord));
        //cut down the larger one (longerstring.length - short string.length, end)
        //concatenate
    }
}
