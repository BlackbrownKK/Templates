package Multithreading.advanceLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Shopper extends Thread{
    static int garCount, potatoCount = 0;
    static Lock pencil = new ReentrantLock();

    public Shopper(String barron) {
    }

    public void addGarlic(){
        pencil.lock();
        garCount++;
        pencil.unlock();
    }

    public void addPotato(){
        pencil.lock();

        potatoCount++;
        addGarlic();
        pencil.unlock();
    }
    public void run(){
        for (int i = 0; i < 10000; i++) {
            addGarlic();
            addPotato();
        }
    }

}
