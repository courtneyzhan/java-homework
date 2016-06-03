/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSet15;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Question6 {
    public static void main(String[] args) {
        int[] originalArray = {1, 0, 1, 0, 0, 1, 1};
        int[] evenArray = new int[3];
        int[] oddArray = new int[4];
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] % 2 == 0) {
                evenArray[evenCount] = originalArray[i];
                evenCount = evenCount + 1;
            } else {
                oddArray[oddCount] = originalArray[i];
                oddCount = oddCount + 1;
            }
        }
        System.out.println(Arrays.toString(evenArray) + Arrays.toString(oddArray));
    }
}
