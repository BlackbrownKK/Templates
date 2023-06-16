package Arrays.leedcode;

public class LoopStatements {
    public static void main(String[] args) {

//        System.out.println(sumOddDigits(-86));
        System.out.println(sumOfBinary( 32));
    }

    public static int sumOddDigits(int n) throws IllegalArgumentException {
        int sum = 0;
        String temp = Integer.toString(n);
        int[] nums = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            nums[i] = temp.charAt(i) - '0';
            if (nums[i] % 2 != 0) sum += nums[i];
        }
      return sum;
    }

    public static int sumOfBinary(int n) {
        int sum = 0;
        String binarysum = Integer.toBinaryString(n);
        System.out.println(binarysum);
        for (int i = 0; i < binarysum.length(); i++) {
            if (binarysum.charAt(i) == '1') {
                sum++;
            }
        }
        return sum;
    }
}
