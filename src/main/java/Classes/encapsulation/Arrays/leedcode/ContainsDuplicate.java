package Classes.encapsulation.Arrays.leedcode;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    /*
    Given an integer array nums, return true if any value appears at
    least twice in the array, and return false if every element is distinct.
    Input: nums = [1,2,3,1] Output: true
    Input: nums = [1,2,3,4] Output: false
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicateV2(nums));
        System.out.println(containsDuplicateV3(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // O ljg n
        for (int i = 1; i < nums.length; i++) { // O n
            if (nums[i - 1] == nums[i]) return true;
        }
        return false;
    }

    public static boolean containsDuplicateV2(int[] nums) {
        HashSet<Integer> container = new HashSet<>();
        for (Integer n : nums) {
            if (container.contains(n)) return true;
            else container.add(n);
        }
        return false;
    }

    public static boolean containsDuplicateV3(int[] nums) { // n2
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }
}


