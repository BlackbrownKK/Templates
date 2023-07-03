package data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
&уква шаблона / Назначение
а Обозначает время до полудня (АМ) или после полудня (РМ)
d День месяца
Е День недели
h Час в 12-часовом формате
н Час в 24-часовом формате
м Месяц
m Минуты
s Секунды
у Год
 */
public class DateTimeDemo3 {
    public static void main(String[] args) {
        LocalDateTime curDateTime = LocalDateTime.now();
        System.out.println(curDateTime.format(DateTimeFormatter.ofPattern("MMMM dd ,  уууу h :  mm а")));
        System.out.println(curDateTime.format(DateTimeFormatter.ofPattern("yyyy MM dd")));
    }
}
