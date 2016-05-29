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
public class Question3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            int userInput = keyboard.nextInt();
            array[i] = userInput;
        }
        boolean hasTwoOrThree = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2 || array[i] == 3) {
                hasTwoOrThree = true;
            }
        }
        
        System.out.println(hasTwoOrThree);
    }
 
}
