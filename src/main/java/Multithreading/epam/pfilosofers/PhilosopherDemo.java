package Multithreading.epam.pfilosofers;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PhilosopherDemo {
    public static void main(String[] args) {
        Lock stickA = new ReentrantLock();
        Lock stickB = new ReentrantLock();
        Lock stickC = new ReentrantLock();
        new Philosopher("Barron", stickA, stickB).start();
        new Philosopher("Olivis", stickB, stickC).start();
        new Philosopher("Stiv", stickA, stickC).start();
    }
}
