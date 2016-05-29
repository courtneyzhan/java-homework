/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSet15;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Administrator
 */
public class Question5 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            int userInput = keyboard.nextInt();
            a[i] = userInput;
        }
        int aSum = 0;
        for (int i = 0; i < 3; i++) {
            aSum = aSum + a[i];
        }

        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            int userInput = keyboard.nextInt();
            b[i] = userInput;
        }
        int bSum = 0;
        for (int i = 0; i < 3; i++) {
            bSum = bSum + b[i];
        }
        
        if(bSum > aSum) {
            System.out.println(Arrays.toString(b));
        } else {
            System.out.println(Arrays.toString(a));
        }
    }
}
