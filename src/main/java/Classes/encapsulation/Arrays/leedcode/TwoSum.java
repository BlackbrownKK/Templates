package Classes.encapsulation.Arrays.leedcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Input: nums = [3,2,4], target = 6
Output: [1,2]
     */

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> intNums = new HashMap<>();
        int[] result = new int[2];

        for (int argument1 = 0; argument1 < nums.length; argument1++) {

            int argument2 = target - nums[argument1];

            if (intNums.containsKey(argument2)) {
                result[0] = intNums.get(argument2);
                result[1] = argument1;
            } else intNums.put(nums[argument1], argument1);
        }
        return result;
    }

    public static int[] twoSumV2(int[] nums, int target) {
        Map<Integer, Integer> intNums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (intNums.containsKey(target - nums[i])) {
                return new int[]{i, intNums.get(target - nums[i])};
            } else intNums.put(nums[i], i);
        }
        return new int[]{};
    }

    public static int[] twoSumV3(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }


    public String front22(String str) {
        // First figure the number of chars to take
//        front22("kitten") → "kikittenki"
//        front22("Ha") → "HaHaHa"
//        front22("abc") → "ababcab"
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }

        String front = str.substring(0, take);
        return front + str + front;
    }

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
//        Arrays.stream(twoSum(nums, 5)).forEach(System.out::println);
//        Arrays.stream(twoSumV2(nums, 5)).forEach(System.out::println);
//        Arrays.stream(twoSumV3(nums, 5)).forEach(System.out::println);
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        if(nums.length == 0) return -1;

        int n = nums.length;
        int totalsum = 0, leftsum = 0;

        for(int i : nums) // {1,7,3,6,5,6}; = 28
            totalsum += i;

        for(int i = 0; i < n; i++) { // 0 == 28-0 -> мы к левой сумме прибавляем, от общей отнимаем
            if(leftsum == (totalsum - nums[i]))
                return i;
            else {
                leftsum += nums[i];
                totalsum -= nums[i];

            }
        }

        return -1;
    }

}
