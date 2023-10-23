package Multithreading.epam;

import java.util.concurrent.atomic.AtomicInteger;

public class Synchronise3 extends Thread{
    static int  garlicCount = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (Synchronise3.class) {
                garlicCount++;
            }
        }
    }
}
