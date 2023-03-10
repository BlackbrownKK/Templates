package Lambda.Ex02;

public class MainNumericTest {
    public static void main(String[] args) {
        // Лямбда-выражение, в котором проверяется, является ли число четным

        NumericTest isEven = (n) -> (n % 2)==0;
        NumericTest isNonNeg = (n) -> n >= 0;
        if(isEven.test(10))
            System.out.println("Чиcлo 10 четное");
        if(!isEven.test(9))
            System.out.println("Чиcлo 9 нечетное");
        if(isNonNeg.test(1))
            System.out.println("Чиcлo 1 неотрицательное");
        if(!isNonNeg.test(-1))
            System.out.println("Чиcлo -1 отрицательное");
    }
}
