package Multithreading.epam;

import reflect.ex01.A;

import java.util.concurrent.atomic.AtomicInteger;

public class Synchronise extends Thread{
    static AtomicInteger garlicCount = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            garlicCount.incrementAndGet();

        }
    }


}
