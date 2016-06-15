/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSet22;

/**
 *
 * @author Administrator
 */
public class Question5 {
     public static void main(String[] args) {
        String userInput = "xxhixx";
        String newOutput = "";
         for (int i = 0; i < userInput.length(); i++) {
             if (userInput.charAt(i) == 'x' && i == 0) {
                newOutput = newOutput.substring(0, userInput.indexOf('x')) + 'y' + userInput.substring(userInput.indexOf('x')+1);
             } else {
                newOutput = newOutput.substring(0, userInput.indexOf('x', i)) + 'y' + userInput.substring(userInput.indexOf('x', i)+1);
             }
         }
        System.out.println(newOutput);
    }
}
