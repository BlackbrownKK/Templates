package Arrays.leedcode;

import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class ConditionStatements {
    public static void main(String[] args) {
        System.out.println(task2(796));
    }

    public static int task2(int n) {
        String temp = Integer.toString(n);
        int[] nums = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            nums[i] = temp.charAt(i) - '0';
        }
        int one = nums[0];
        int two= nums[1];
        int three= nums[2];
        String resSts;
        if (one >= two && one >= three) {
            resSts = String.join("",Integer.toString(one), Integer.toString(Math.max(two, three)),
                    Integer.toString(Math.min(two, three)));
            return parseInt(resSts);
        } else if (two >= one && two >= three) {
            resSts = String.join("", Integer.toString(two), Integer.toString(Math.max(one, three)),
                    Integer.toString(Math.min(one, three)));
            return parseInt(resSts);
        } else {
            resSts = String.join("",Integer.toString(three), Integer.toString(Math.max(one, two)),
                    Integer.toString(Math.min(one, two)));
            return parseInt(resSts);
        }
//        throw new UnsupportedOperationException();
    }
}
