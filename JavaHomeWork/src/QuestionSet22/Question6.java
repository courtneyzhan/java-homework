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
public class Question6 {

    public static void main(String[] args) {
        String userInput = "a";
        int n = 3;
        int nSequence = 0;
        for (int i = 0; i < userInput.length()-2; i++) {
            char currentChar = userInput.charAt(i);
            if (userInput.charAt(i + 1) == currentChar) {
                for (int j = 2; j <= n; j++) {
                    if (currentChar == userInput.charAt(i+j)) {
                        nSequence = nSequence + 1;
                        break;
                    }
                }
            }
        }
        System.out.println(nSequence);
    }
}
