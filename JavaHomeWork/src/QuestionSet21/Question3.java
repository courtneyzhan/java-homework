/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSet21;
//lol
/**
 *
 * @author Administrator
 */
public class Question3 {

    public static void main(String[] args) {
        String userInput = "abXYabc";
        int n = 3;
        String initialString = userInput.substring(0, n);
        if (userInput.contains(initialString)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
