package Multithreading.epam;

import java.util.concurrent.atomic.AtomicInteger;

public class Synchronise2 extends Thread {
    static int garlicCount = 0;

    private static synchronized void addGarlic(){
        garlicCount++;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            addGarlic();

        }
    }
}
