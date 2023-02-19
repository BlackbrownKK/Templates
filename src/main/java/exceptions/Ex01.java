package exceptions;

public class Ex01 {

    public static void main(String args[]) {
        int d, а;
        try { //проконтролировать блок кода // блок кода, в котором отслеживаются ошибки
            d = 0;
            а = 42 / d;
            System.out.println("Этo не будет выведено.");
        } catch (ArithmeticException е) { // обработчик исключений тип_исключения_1 и т.д
//перехватить ошибку деления на нуль
            System.out.println("Дeлeниe на нуль");
            System.out.println("Пocлe оператора catch.");
        }
    }
}

//         finally блок кода, который должен быть непременно выполнен по завершении блока try
