package Multithreading;
import java.util.Random;
public class Counter {
    int a;
    int b;

    public void mix() {
        a++;
        try {
            Thread.sleep(new Random().nextInt(1));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        b += 1;
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
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
}