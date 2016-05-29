/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSet16;

/**
 *
 * @author Administrator
 */
///////////////////////////// PROBLEM STATEMENT ////////////////////////////////
// Given an array length 1 or more of ints, print the difference between the  //
// largest and smallest values in the array. Note: the built-in               //
// Math.min(v1, v2) and Math.max(v1, v2) methods print the smaller or larger  //
// of two values.                                                             //
//   ({10, 3, 5, 6}) -> 7                                                     //
//   ({7, 2, 10, 9}) -> 8                                                     //
//   ({2, 10, 7, 2}) -> 8                                                     //
////////////////////////////////////////////////////////////////////////////////
public class Question5 {

    public static void main(String[] args) {
        int[] array = {10, 3, 5, 6};
        int highestNumber = array[0];
        for (int counter = 1; counter < array.length; counter++) {
            if (array[counter] > highestNumber) {
                highestNumber = array[counter];
            }
        }
        int lowestNumber = highestNumber;
        for (int counter = 1; counter < array.length; counter++) {
            if (array[counter] <= lowestNumber) {
                lowestNumber = array[counter];
            }
        }

        System.out.println(highestNumber-lowestNumber);
        
    }
}
