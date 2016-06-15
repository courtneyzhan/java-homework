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
public class Question5 {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3};
        int[] num2 = {2, 3, 10};
        int count = 0;
        for (int i = 0; i < num1.length; i++) {
            if (((num1[i] - num2[i]) < 2 && (num1[i] - num2[i]) >=0 ) || ((num2[i] - num1[i]) < 2 && (num2[i] - num1[i]) >=0 )) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
