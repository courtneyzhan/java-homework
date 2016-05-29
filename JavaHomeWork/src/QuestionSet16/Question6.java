/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSet16;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Question6 {
    public static void main(String[] args) {
        int[] array = {2, 1, 4, 5, 3};
        boolean isTrue = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                for (int j = 0; j < array.length; j++) {
                    if (j < i) {
                        continue;
                    }
                    if (array[j] == 2) {
                        isTrue = true;
                    }
                }
            }
        }
        System.out.println(isTrue);
    }
}
