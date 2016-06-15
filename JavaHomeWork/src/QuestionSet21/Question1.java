/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSet21;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class Question1 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {3, 4};
        int aSum = 0;
        int bSum = 0;
        
        for (int i = 0; i < a.length; i++) {
            aSum = aSum + a[i];
        }
        for (int i = 0; i < b.length; i++) {
            bSum = bSum + b[i];
        }
        if (bSum > aSum) {
            System.out.println(Arrays.toString(b));
        } else {
            System.out.println(Arrays.toString(a));
        }
    }
}
