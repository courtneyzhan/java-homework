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
public class Question5 {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2};
        for (int i = 0; i < array.length -1; i++) {
            if ((array[i] == 2 && array[i + 1] == 2)) {
                System.out.println(true);
                break;
            } else {
                System.out.println(false);
            }
        }
    }
}
