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
public class Question6 {
    public static void main(String[] args) {
        int[] array = {5, 3, 3, 2, 1};
        int start = 0;
        int end = 4;
        int count = 0;
               
        if (start <= end) {
            for (int i = start; i < end - start; i++) {
                if (array[i]>=array[i+1]) {
                    count = count + 1;
                }
            }
        }
        if (count == array.length - 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
