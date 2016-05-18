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
public class Question6 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Is it morning?");
        boolean morning = keyboard.nextBoolean();
        System.out.println("Is mum calling?");
        boolean mum = keyboard.nextBoolean();
        System.out.println("Are you asleep?");
        boolean asleep = keyboard.nextBoolean();
        if(asleep == true) {
            System.out.println(false);
        } else if(mum == true) {
            System.out.println(true);
        } else if(morning == true) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
