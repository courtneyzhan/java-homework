/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSet16;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Question3 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int[] array = {4, 5, 6}; 
        int[] newArray = new int[array.length * 2];
        newArray[newArray.length-1] = array[array.length-1];
        
        System.out.println(Arrays.toString(newArray));
    }
}
