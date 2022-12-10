package Multithreading;
import java.util.Random;
public class CounterThread {
    int a;
    int b;

    public static void main(String[] args) throws InterruptedException {

        CounterThread counter = new CounterThread();

        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) counter.mix();
        };

        Thread thread = new Thread(runnable);
        thread.start();

        for (int i = 0; i < 100; i++) counter.mix();

        thread.join();

        System.out.println(counter.a);
        System.out.println(counter.b);
    }
    public synchronized void mix() {   //synchronized code processing race condition
        a++;
        try {
            Thread.sleep(new Random().nextInt(20));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        b += 1;
    }
}