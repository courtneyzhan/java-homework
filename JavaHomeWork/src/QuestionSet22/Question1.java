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
public class Question1 {

    public static void main(String[] args) {
        int[] array = {1, 7, 7};
        for (int i = 0; i < array.length; i++) {
            if ((array[i] == 7 && array[i + 1] == 7) || (array[i] == 7 && array[i + 2] == 7)) {
                System.out.println(true);
                break;
            } else {
                System.out.println(false);
            }
        }
    }
}
