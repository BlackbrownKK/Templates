package doc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * В этом классе демонстрируется применение
 * документирущих комментариев
 * @author Герберт Шилдт
 * @version 1.2
 */
public class SquareNum {
    /**
     * Этот метод возвращает квадрат числа.
     * Это многострочное описание. В нем можно ввести
     * столько строк, сколько потребуется.
     * @param num Значение, которое требуется возвести в квадрат
     * @return num Значение, возведенное в квадрат
     */
    public double square(double num) {
        return num * num;
    }


    /**
     * Этот метод вводит число, заданное пользователем
     *
     * @return Введенное значение типа doubla
     * @exception Если при вводе возникает ошибка, то генерируется исключение типа IOException
     * @see IOException
     */

    public double getNumber() throws IOException {
// создать буферизированный поток чтения
// типа BufferedReader, используя стандартный
//поток ввода System.in
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader inData = new BufferedReader(isr);
        String str;
        str = inData.readLine();
        return (new Double(str)).doubleValue();
    }

    /**
     * Приложение А. Применение документирующих комментариев в Java
     * В этом методе демонстрируется применение метода square()
     * @param args Не используется
     * @exception  Если при вводе возникает ошибка, то генерируется исключение типа IOException
     * @see IOException
     */
    /**
     *  ‹img srс="doc-files/uml.png" аlt="Diagram UML"/›
     * @param args
     * @throws IOException
     */
    public static void main(String args[]) throws IOException {
        SquareNum ob = new SquareNum();
        double val;
        System.out.println("Введите значение для возведения в квадрат: ");
        val = ob.getNumber();
        val = ob.square(val);
        System.out.println("Kвaдpaт значения равен " + val);
    }

    /**
     * Returns the character at the specified index. An index
     * ranges from ‹code›0‹/code› to ‹code›length() - 1‹/code›.
     *
     * @param  index the index of the desired character.
     * @return the desired character.
     * @throws StringIndexOutOfRangeException
     *    if the index is not in the range ‹code›0‹/code›
     *    to ‹code›length()-1‹/code›.
     * @see    java.lang.Character#charValue()
     * @deprecated Use setVisible(true) instead
     */
    public char charAt(int index) throws StringIndexOutOfBoundsException{
        System.out.println("L");
        return 'c';
    }
}
