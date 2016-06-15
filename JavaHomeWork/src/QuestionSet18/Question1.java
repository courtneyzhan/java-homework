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
public class Question1 {
    public static void main(String[] args) {
        int[] array = {2, 1, 2, 3, 4,};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + 1;
            }
        }
         System.out.println(sum);       
    }
}
