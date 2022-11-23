package Constructors.demo_02;

import java.text.DecimalFormat;

// Применение параметризованного конструктора.
// Применение DecimalFormat для округления значений.

public class ProduktB {

    private static String name;
    private static int qnty;
    private static float price;
    private final static float TAX_RATE = 0.15f;
    private static Produkt produkt;
    private static float totalIncome;
    private static float tax;
    private static String incomeResult;
    private static String taxResult;


    public static void main(String[] args) {

        name = "Печенье";
        qnty = 23;
        price = 12.00f;
        // error !!!
//         TAX_RATE =  0.15f;

// Создание экземпляра класса-конструктора,
// переменные указаны в параметрах конструктора, т.е. в ().
        produkt = new Produkt(name, qnty, price);

// Если оперируем только конструктором по умолчанию, то
// необходима установка значений через setters,
// но в этом варианте этого не нужно.
        //produkt.setName(name);
        //produkt.setQnty(qnty);
        //produkt.setPrice(price);

// Подсчет дохода через метод calculateTotalIncome()
        totalIncome = calculateTotalIncome(
// получение значений для расчета через getters
                produkt.getQnty(),
                produkt.getPrice()
        );

// Подсчет налога
        tax = totalIncome * TAX_RATE;

// Округление дохода через метод roundValue()
        incomeResult = roundValue(totalIncome);

// Округление налога через метод roundValue()
        taxResult = roundValue(tax);

// Вывод результатов в консоль
        System.out.println(
                "Расчет продаж и налога" +
                "\nТовар: " + produkt.getName() +
                "\nКоличество: " + produkt.getQnty() +
                "\nДоход: " + incomeResult + " грн." +
                "\nНалог: " + taxResult + " грн."
        );

    }

// Метод рассчета дохода
   private static float calculateTotalIncome(int quota, float price){
        return quota * price;
    }

// Метод roundValue(), округляющий результаты подсчета дохода и налога.
// Применен DecimalFormat со строковым шаблоном "#.##", т.е. остаются 2 знака
// после запятой. Если нужно 3 знака, то - "#.###", и т.д.
// DecimalFormat - это конкретный подкласс NumberFormat,
// который форматирует десятичные числа.
// Здесь метод format() принимает значение float в качестве аргумента и
// возвращает форматированное число в String. То есть, в System.out.println
// выводится уже отформатированное значение.
// Не модифицируйте его, просто используйте для округления значений.
// Обратите внимание, что установлен паттерн "#.00", должен работать
// со значениями переменной типа 12.00 , т.е. нули после запятой.
    private static String roundValue(float value){
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(value);
    }

}
