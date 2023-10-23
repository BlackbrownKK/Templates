package Multithreading.tryLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Shopper extends Thread {
    String name;
    private int itemsToAdd = 0;
    private static int itemsOnNotepad = 0;
    private static Lock pencil = new ReentrantLock();

    public Shopper(String name) {
        this.name = name;
    }

    public void run() {
        while (itemsOnNotepad <= 20) {
            if ((itemsToAdd > 0) && pencil.tryLock()) {
                try {
                    //pencil.tryLock();
                    itemsOnNotepad += itemsToAdd;
                    System.out.println(this.getName() + " added" + itemsToAdd + " items is notepad");
                    itemsToAdd = 0;
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    pencil.unlock();
                }
            } else {
                try {
                    Thread.sleep(100);
                    itemsToAdd++;
                    System.out.println(this.getName() + " find something to buy");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
