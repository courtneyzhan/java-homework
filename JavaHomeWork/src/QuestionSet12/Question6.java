/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSet12;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
 ////////////////////////////// PROBLEM STATEMENT //////////////////////////////
 // Given three ints, a b c, print true if one of b or c is "close"           //
 // (differing from a by at most 1), while the  other is "far", differing     //
 // from both other values by 2 or more. Note: Math.abs(num) computes the     //
 // absolute value of a number.                                               //
 //   1, 2, 10 -> true                                                        //
 //   1, 2, 3 -> false                                                        //
 //   4, 1, 3 -> true                                                         //
 ///////////////////////////////////////////////////////////////////////////////
public class Question6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the first integer (a): ");
        int a = keyboard.nextInt();
        System.out.print("Please enter the second integer (b): ");
        int b = keyboard.nextInt();
        System.out.print("Please enter the third integer (c): ");
        int c = keyboard.nextInt();
        
        if( ( ( (b - c) <= 1) && ((b-c) >= 0)) || (((c - b) <= 1) && ((c-b) >= 0 ))) {
            if (((a - c) >= 2) || ((a - b) >= 2)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } else {
            System.out.println(true);
        }
    }
}

