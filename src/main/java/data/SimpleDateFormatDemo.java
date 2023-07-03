package data;

import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDateFormatDemo {
    public static void main(String[] args) {
         Date date = new Date();
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("hh:mm:ss");
        System.out.println(sdf.format(date));
        sdf = new SimpleDateFormat("dd МММ уууу hh:mm:ss zzz");
        System.out.println(sdf.format(date));
        sdf = new SimpleDateFormat("E МММ dd уууу");
        System.out.println(sdf.format(date));

        Date dateq = new Date();
        SimpleDateFormat sdf1;
        sdf1 = new SimpleDateFormat("hh:mm:ss");
        System.out.println(sdf1.format(date));
        sdf1 = new SimpleDateFormat("dd МММ уууу hh:mm:ss zzz");
        System.out.println(sdf1.format(date));
        sdf1 = new SimpleDateFormat("E МММ dd уууу");
        System.out.println(sdf1.format(date));
    }
}

/*
а АМ (до полудня) или РМ (после полудня)
d День месяца (1-31)
h Часы в формате АМ/РМ (1-12)
k Часы в формате суток (1-24)
m Минуты (0-59)
в Секунды (0-59)
w Неделя в году (1-52)
у Год
z Часовой пояс
D День в году (1-366)
Е День недели (например, четверг)
F День недели в месяце
G Эра (АО - после Рождества Христова, или наша эра, ВС - до Рождества
Христова, или до нашей эры)
Н Часы в сутках (0-23)
К Часы в формате АМ/РМ (0-11)
м Месяц
s Миллисекунды в секунде
W Неделя в месяце (1-5)
Х Часовой пояс в формате по стандарту ISO 8601
У Неделя в году
Z Часовой пояс в формате по стандарту RFC 822
 */
