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
public class Question4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            int userInput = keyboard.nextInt();
            a[i] = userInput;
        }
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            int userInput = keyboard.nextInt();
            b[i] = userInput;
        }
        
        System.out.println(a[0] == b[0] || a[a.length-1] == b[b.length-1]);
    }
}
