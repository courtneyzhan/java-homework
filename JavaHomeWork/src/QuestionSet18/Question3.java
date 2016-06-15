/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSet18;

/**
 *
 * @author Administrator
 */
public class Question3 {
    public static void main(String[] args) {
        int[] array = {4, 1, 2, 2};
        boolean two = false;
        boolean four = false;
        for (int i = 0; i < array.length -1; i++) {
            if ((array[i] == 2 && array[i + 1] == 2)) {
                two = true;
                break;
            }
        }
        for (int i = 0; i < array.length -1; i++) {
            if ((array[i] == 4 && array[i + 1] == 4)) {
                four = true;
                break;
            }
        }
        if (four && two) {
            System.out.println(false);
        } else if (four && !two) {
            System.out.println(true);
        }  else if (two && !four) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
