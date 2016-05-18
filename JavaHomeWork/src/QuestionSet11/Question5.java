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
public class Question5 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your speed: ");
        int speed = keyboard.nextInt();
        System.out.print("Is it your birthday? ");
        boolean birthday = keyboard.nextBoolean();
        int birthdayBonus = 0;
        if(birthday == true) {
           birthdayBonus = 5;
        }
        
        if(speed <= 60+ birthdayBonus){
            System.out.println(0);
        } else if((speed > (60 + birthdayBonus)) && (speed <= (80 + birthdayBonus))) {
            System.out.println(1);
        } else if(speed > (80 + birthdayBonus)) {
            System.out.println(2);
        }
    }
}
