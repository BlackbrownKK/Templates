package Multithreading.synchroniz.synchroniz01;

public class Callme {
      void call(String msg) {

        System.out.print(" [" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException е) {
            System.out.println("Прервано");

        }
          System.out.println("] ");
    }
}
