/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSet14;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Quesiton3 {
    public static void main(String[] args) {
        ////////////////////////////// PROBLEM STATEMENT //////////////////////////////
        // Given an array of ints, print true if the array contains a 2 next to a 2  //
        // or a 4 next to a 4, but not both.                                         //
        //   {1, 2, 2} -> true                                                       //
        //   {4, 4, 1} -> true                                                       //
        //   {4, 4, 1, 2, 2} -> false                                                //
        ///////////////////////////////////////////////////////////////////////////////
        int[] array = {1, 2, 2};
        boolean hasCombination = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2 && array[i+1] == 2) {
                if(hasCombination == true) {
                    hasCombination = false;
                } else {
                    hasCombination = true;
                }
            } else if(array[i+1] == 4 && array[i] == 4) {
                if(hasCombination == true) {
                    hasCombination = false;
                } else {
                    hasCombination = true;
                }            
            }
        }
        if (hasCombination == true) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
