package exceptions;

public class BlocksTryCatch {
    public static void main(String[] args) {
        String[] numbers = {"50", "0", "WE-", "25"};
        int res;
        int sum = 0;
        for (String number : numbers) {
            try {
                res = Integer.parseInt(number);
                try {
                    sum += 100 / res;
                } catch (ArithmeticException e) {
                    System.out.println(e);
                }
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
        System.out.println(sum);
    }
}
