package Arrays;

import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 4, 5};
        int[] nums2 = new int[]{6, 7, 8, 9, 10, 0, 0, 0, 0, 0};

        System.arraycopy(nums1, 0, nums2, 5, nums1.length-1);  // 1 2 3 4 10 0 0 0 0 0

        System.out.println(Arrays.toString(nums2));
        System.out.println();
        int i = 0;
        while (i < nums2.length) {
            System.out.println(nums2[i]);
            i++;
        }

    }
}
