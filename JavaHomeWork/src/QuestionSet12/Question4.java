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
public class Question4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What day is it? ");
        int day = keyboard.nextInt();
        System.out.print("Are you on vacation? ");
        boolean vacation = keyboard.nextBoolean();
        if (vacation == true) {
            switch(day) {
                case 0: System.out.println("off");
                        break;
                case 1: System.out.println("10:00");
                        break;
                case 2: System.out.println("10:00");
                        break;
                case 3: System.out.println("10:00");
                        break;
                case 4: System.out.println("10:00");
                        break;
                case 5: System.out.println("10:00");
                        break;
                case 6: System.out.println("off");
                        break;
                default: System.out.println("Invalid Day");
            } 
        } else {
            switch(day) {
                case 0: System.out.println("10:00");
                        break;
                case 1: System.out.println("7:00");
                        break;
                case 2: System.out.println("7:00");
                        break;
                case 3: System.out.println("7:00");
                        break;
                case 4: System.out.println("7:00");
                        break;
                case 5: System.out.println("7:00");
                        break;
                case 6: System.out.println("10:00");
                        break;
                default: System.out.println("Invalid Day");
            } 
        }
    }
}
