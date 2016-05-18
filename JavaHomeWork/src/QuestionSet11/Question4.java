/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSet11;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Question4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the first number on your lottery ticket: ");
        int firstNumber = keyboard.nextInt();
        System.out.print("Please enter the second number on your lottery ticket: ");
        int secondNumber = keyboard.nextInt();
        System.out.print("Please enter the third number on your lottery ticket: ");
        int thirdNumber = keyboard.nextInt();
        
        if (((firstNumber + secondNumber) == 10) || ((firstNumber + thirdNumber) == 10) || ((secondNumber + thirdNumber) == 10)) {
            System.out.println(10);
        } else if((firstNumber + secondNumber) == (10+(secondNumber + thirdNumber)) || (firstNumber + secondNumber) == (10+(firstNumber + thirdNumber))){
            System.out.println(5);
        } else {
            System.out.println(0);
        }

    }
}
