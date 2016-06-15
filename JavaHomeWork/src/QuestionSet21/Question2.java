/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSet21;

/**
 *
 * @author Administrator
 */
public class Question2 {
    public static void main(String[] args) {
        String userInput = "Miracle";
        String output = "";
        int n = 2;
        for (int i = 0; i < userInput.length(); i++) {
            if (i % n == 0) {
                output = output + userInput.charAt(i);
            }
        }
        System.out.println(output);
    }
}
