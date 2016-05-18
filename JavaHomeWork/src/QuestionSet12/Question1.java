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
public class Question1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter loan: ");
        float loan = keyboard.nextFloat();
        if(loan < 25000) {
            System.out.println(loan * 0.05);
        } else if(loan >= 3500 && loan < 50000) {
            System.out.println(1250 + ((loan - 25000) * 0.1));
        } else if(loan >= 50000 && loan < 100000) {
            System.out.println(5000 + ((loan - 50000) * 0.25));

        }
    }
}
