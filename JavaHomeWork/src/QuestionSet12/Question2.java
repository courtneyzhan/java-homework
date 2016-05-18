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
public class Question2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a number (n): ");
        int n = keyboard.nextInt();
        if(n < 21) {
            System.out.println(21 - n);
        } else {
            System.out.println((n - 21) * 2);
        }
    }
}
