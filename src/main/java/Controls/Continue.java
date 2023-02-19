package Controls;

public class Continue {
    public static void main(String[] args) {

        outer:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j > i) {
                    System.out.println();


                    //В данном примере оператор continue прерывает цикл подсчета значений переменной
                    //j и продолжает его со следующего шага цикла, в котором подсчитываются
                    //значения переменной i. Эта программа выводит следующий результат:


                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
                System.out.println();
    }
}
