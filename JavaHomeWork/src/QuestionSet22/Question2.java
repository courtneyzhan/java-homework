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
public class Question2 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        boolean noOnes = true;
        boolean noFours = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                noOnes = false;
            } else if (array[i] == 4) {
                noFours = false;
            }
        }
        if (noFours == false && noOnes == false) {
            System.out.println(true);

        } else {
            System.out.println(noOnes || noFours);
        }
    }
}
