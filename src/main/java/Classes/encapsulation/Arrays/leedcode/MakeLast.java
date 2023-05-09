package Classes.encapsulation.Arrays.leedcode;

import java.util.Arrays;

public class MakeLast {
    public static void main(String[] args) {
        int[] in = new int[]{1, 5, 9, 4, 7, 5, 2};
        System.out.println(Arrays.toString(in));
        System.out.println(Arrays.toString(makeLast01(in)));

    }

    public static int[] makeLast01(int[] nums) {
        int[] res = new int[nums.length * 2];
        res[res.length - 1] = nums[nums.length - 1];
        return res;
    }

    public static boolean double23(int[] nums) {
        if (nums.length == 2) {
            if (nums[0] == nums[1]) {
                return nums[0] == 2 || nums[0] == 3;
            }
        }
        return false;
    }
}
