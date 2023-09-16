/*
You are given an array of n-1 integers, and these integers are in the range of 1 to n.
There are no duplicates in the array. One of the integers is missing in the array.
Write a function that finds and returns the missing number.
*/

package self_study.arrays.e001;

import java.util.*;
import java.io.*;
public class Exercise {
    //COMPLETE THIS FUNCTION
    private static int process(String[] numbers) {
        int[] nums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(nums);
        int lastIndex = nums.length - 1;
        if (nums[0] != 1) {
            return 1;
        } else if (nums[lastIndex] != nums.length + 1) {
            return (nums.length + 1);
        } else {
                for (int i = 0; i < nums.length - 1; i++) {
                    if ((nums[i + 1] - nums[i]) != 1) {
                        return (nums[i] + 1);
                    }
                }

        }
        return 0;
    }
    //you do not need to edit any code below this line
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        //process(numbers);
        System.out.println(process(numbers));
    }
}