package Controls.codePractice;

public class Happy {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    private static boolean isHappy(int n) {
        int count = 1000;
        while (count > 0) {
            String s = Integer.toString(n);
            n = 0;
            int[] arr = new int[s.length()];
            for (int i = 0; i < s.length(); i++) {
                String newS = String.valueOf(s.charAt(i));
                arr[i] = Integer.parseInt(newS);
            }
            for (int num : arr) {
                n += Math.pow(num, 2);
            }
            if (n == 1) break;
            count--;
        }
        return n == 1;
    }
}