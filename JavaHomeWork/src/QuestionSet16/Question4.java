/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSet16;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Administrator
 */
public class Question4 {
    public static void main(String[] args) {
        int[] array = {3, 3};
        for (int i = 0; i < array.length; i++) {
            if ((array[i] == 2 && array[i+1] == 2) || (array[i] == 3 && array[i+1] == 3)) {
                System.out.println(true);
                break;
            }
        }
                
    }
}
