package Classes.encapsulation.Arrays.leedcode;

public class ProductExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] numsq = productExceptSelf(nums);
        for (int i = 0; i < numsq.length; i++) {
            System.out.println(numsq[i]);
        }
        int[] numsq2 = productExceptSelfNumsAsPrefix(nums);
        for (int i = 0; i < numsq.length; i++) {
            System.out.println(numsq2[i]);
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int right = 1, left = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }
        return arr;
    }

    public static int[] productExceptSelfNumsAsPrefix(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i = 0; i < nums.length - 1; i++)
            res[i + 1] = res[i] * nums[i];
            for (int i = nums.length - 2; i >= 0; i--) {
                res[i] = nums[i + 1] * res[i];
                nums[i] = nums[i] * nums[i + 1];
            }
            return res;
        }
    }
/*
 public int[] productExceptSelfNumsAsPrefix(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = 1;
        for (int i = 0; i < nums.length - 1; i++) output[i + 1] =
            output[i] * nums[i];
        for (int i = nums.length - 2; i >= 0; i--) {
            output[i] = nums[i + 1] * output[i];
            nums[i] = nums[i] * nums[i + 1];
        }
        return output;
    }
}
 */