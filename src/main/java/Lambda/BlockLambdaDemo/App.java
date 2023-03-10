package Lambda.BlockLambdaDemo;

public class App {
    public static void main(String[] args) {
        // Это блочное лямбда-выражение вычисляет факториал целочисленного значения
        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println("Фaктopиaл числа 3 равен "
                + factorial.func(3));
        System.out.println("Фaктopиaл числа 5 равен"
                + factorial.func(20));
    }
}
