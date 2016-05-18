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
 /////////////////////////// PROBLEM STATEMENT //////////////////////////
 // Given three ints, a b c, one of them is small, one is medium and   //
 // one is large. Print true if the three values are evenly spaced,    //
 // so the difference between small and medium is the same as the      //
 // difference between medium and large.                               //
 //   (2, 4, 6) -> true                                                //
 //   (4, 6, 2) -> true                                                //
 //   (4, 6, 3) -> false                                               //
 ////////////////////////////////////////////////////////////////////////
public class Question3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the first integer (a): ");
        int a = keyboard.nextInt();
        System.out.print("Please enter the second integer (b): ");
        int b = keyboard.nextInt();
        System.out.print("Please enter the third integer (c): ");
        int c = keyboard.nextInt();
        if((a-b) == (b-c) || (a-c) == (c-b) || (b-c) == (c-a) || (b-a) == (a-c) || (c-b) == (b-a) || (c-a) == (a-b)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        
    }
}
