package Multithreading.epam.pfilosofers;

import java.util.concurrent.locks.Lock;

public class Philosopher extends Thread {
    private Lock firstChopStick, secondChopStick;
    private static int sushiCount = 5_000;

    public Philosopher(String name, Lock firstChopStick, Lock secondChopStick) {
        this.setName(name);
        this.firstChopStick = firstChopStick;
        this.secondChopStick = secondChopStick;
    }

    @Override
    public void run() {
        while (sushiCount > 0) {
            firstChopStick.lock();
            secondChopStick.lock();
            try {

                if (sushiCount > 0) {
                    sushiCount--;
                    System.out.println(this.getName() + " took a piece! Sushi remaining " + sushiCount);
                }
                if (sushiCount == 10) {
                    System.out.println(1/0);
                }
            } finally {
                secondChopStick.unlock();
                firstChopStick.unlock();
            }
        }
    }
}
