/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSet15;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Question2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            int userInput = keyboard.nextInt();
            array[i] = userInput;
        }
        System.out.println(array[array.length-1] == 6 || array[0] == 6);
    }
}
