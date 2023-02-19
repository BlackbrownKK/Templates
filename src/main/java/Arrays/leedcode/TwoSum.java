package Arrays.leedcode;

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


        public static void main (String[]args){
            int[] nums = {36, 15, 15, 2, 9, 47, 1, 2, 4, 9, 8, 3, 5, 7, 9, 1, 2, 6, 4, 8, 5, 6, 89, 4, 2, 5, 89, 5, 15, 5};
            Arrays.stream(twoSum(nums, 5)).forEach(System.out::println);
            Arrays.stream(twoSumV2(nums, 5)).forEach(System.out::println);
            Arrays.stream(twoSumV3(nums, 5)).forEach(System.out::println);
        }
    }
