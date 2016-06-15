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
public class Question6 {

    public static int countClumps(int[] nums) {
        boolean match = false;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && !match) {
                match = true;
                count++;
            } else if (nums[i] != nums[i + 1]) {
                match = false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4};
        System.out.println(countClumps(array));
    }

}
