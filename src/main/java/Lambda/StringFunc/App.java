package Lambda.StringFunc;

public class App {
    public static void main(String[] args) {
        // Это блочное выражение изменяет на обратный порядок следования символов в строке
        Func reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };

        System.out.println("Лямбдa обращается на "
                + reverse.func("Лямбдa"));
        System.out.println("Bыpaжeниe обращается на "
                + reverse.func("Bыpaжeниe"));
    }
}
