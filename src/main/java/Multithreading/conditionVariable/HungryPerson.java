package Multithreading.conditionVariable;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class HungryPerson extends Thread {
    private int personID;
    private static Lock showCookerId = new ReentrantLock();
    private static int servingsId = 11;

    private static Condition soupTaken = showCookerId.newCondition();

    public HungryPerson(int personID) {
        this.personID = personID;
    }

    @Override
    public void run() {
        while (servingsId > 0) {
            showCookerId.lock();
            try {
                while ((personID != servingsId % 2) && servingsId > 0) {
                    soupTaken.await();
                    servingsId--;
                    System.out.println("Person %d checked... then put the lid back.\n" + personID + servingsId);

                }{
                    System.out.println("Person %d checked... then put the lid back.\n" + personID);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                showCookerId.unlock();
            }
        }
    }
}
