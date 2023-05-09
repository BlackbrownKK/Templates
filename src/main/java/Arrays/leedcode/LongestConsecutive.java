package Arrays.leedcode;

import java.util.*;

public class LongestConsecutive {

    public static void main(String[] args) {


        int[] prices = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1, 0, 2, 4, 5, 9, 6, 5, 4, 7}; // -> 00012234445556677899 = 10
        int[] prices1 = new int[]{100, 4, 200, 1, 3, 2}; // ->   = 4
        int[] prices2 = new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6}; // -> -1-1013456789 = 4
        System.out.println(longestConsecutive(prices2));
    }

    public static int longestConsecutive(int[] nums) {
        int sum = 1;
        List<Integer> sums = new ArrayList<>();
        if (nums.length == 0) return 0;
        int n = nums.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (nums[j - 1] > nums[j]) {
                    //swap (перестановка) элементов
                    temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 1) sum++;
            else if (nums[i + 1] - nums[i] > 1) {
                sums.add(sum);
                sum = 1;// запись sum , оборвать sum, сделать новый элемент и в него запывать
            }
        }
        sums.add(sum);
        System.out.println();
        System.out.println(sums);
        return Collections.max(sums);
    }


}

