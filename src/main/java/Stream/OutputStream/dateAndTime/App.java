package Stream.OutputStream.dateAndTime;

import java.util.Timer;

public class App {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.now(); // Create a date object
//        LocalTime myTima = LocalTime.now(); // Create a date object
//        System.out.println(date + " " + myTima);
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//        LocalDate date2 = date.plusDays(3);
//        System.out.println(date.isAfter(date2));



        Timertask myTask = new Timertask();
        Timer myTimer = new Timer();
        // Установить первоначальную паузу в течение одной секунды, а затем повторять задание каждые полсекунды
        myTimer.schedule(myTask, 1000, 500);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ехс) {}
        myTask.cancel();

    }



}
