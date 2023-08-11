package exceptions;

public class BlocksTryCatchV2Finally {
    public static void main(String[] args) {
        String[] numbers = {"50", "0", "WE-", "25"};
        int res;
        int counter=0;
        int sum = 0;
        for (String number : numbers) {
            try {
                res = Integer.parseInt(number);
                sum += 100 / res;
            } catch (ArithmeticException | NumberFormatException e) {
                System.out.println(e);
            }
            finally {
                System.out.println("counter= " + ++counter);
            }
        }
        System.out.println(sum);

    }
}
