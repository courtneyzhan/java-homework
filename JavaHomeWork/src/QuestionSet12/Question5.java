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
 /////////////// PROBLEM STATEMENT /////////////////////
 // Read 3 integers and print them in ascending order //
 //   1 3 2 -> 1 2 3                                  //
 //   3 1 2 -> 1 2 3                                  //
 //   8 5 2 -> 2 5 8                                  //
 ///////////////////////////////////////////////////////
public class Question5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the first integer: ");
        int numOne= keyboard.nextInt();
        System.out.print("Please enter the second integer: ");
        int numTwo = keyboard.nextInt();
        System.out.print("Please enter the third integer: ");
        int numThree = keyboard.nextInt();
        
        if(numOne < numTwo && numOne < numThree) {
            System.out.print(numOne);
            if(numTwo > numThree) {
                System.out.print(numThree);
                System.out.print(numTwo);
            } else {
                System.out.print(numTwo);
                System.out.print(numThree);
            }
        } else if(numTwo < numOne && numTwo < numThree) {
            System.out.print(numTwo);
            if(numOne > numThree) {
                System.out.print(numThree);
                System.out.print(numOne);
            } else {
                System.out.print(numOne);
                System.out.print(numThree);
            }
        } else if(numThree < numOne && numThree < numTwo) {
            System.out.print(numThree);
            if(numTwo > numOne) {
                System.out.print(numOne);
                System.out.print(numTwo);
            } else {
                System.out.print(numTwo);
                System.out.print(numOne);
            }
        }
        
        System.out.println(" ");
    }
}
