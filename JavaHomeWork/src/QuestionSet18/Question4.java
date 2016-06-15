/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSet18;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class Question4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int number = 0;
        if (array[0] > array[array.length-1]) {
            number = array[0];
        } else {
            number = array[array.length-1];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
        System.out.println(Arrays.toString(array));    
    }
}
