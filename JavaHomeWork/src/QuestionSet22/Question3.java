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
public class Question3 {
    public static boolean checkIfThreeNextToThree(int[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3 && array[i+1] == 3) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] array = {3, 1, 3, 1, 3};
        System.out.println(checkIfThreeNextToThree(array));
    }
}
