/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSet16;
import java.util.Scanner;
import java.util.Arrays;
/**
 *  :)
 * @author Administrator
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] a = new int[2];
        for (int i = 0; i < 2; i++) {
            int userInput = keyboard.nextInt();
            a[i] = userInput;
        }
        int[] b = new int[2];
        for (int i = 0; i < 2; i++) {
            int userInput = keyboard.nextInt();
            b[i] = userInput;
        }
        
        int[] array = new int[4];
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i];
        } 
        for (int i = 0; i < b.length; i++) {
            array[i+a.length] = b[i];
        }
        
        System.out.println(Arrays.toString(array));
    }
}
