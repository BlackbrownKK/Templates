package Multithreading.synchroniz.synchroniz03;

import java.util.concurrent.Semaphore;

/*
Реализация поставщика и потребителя, использующая семафоры для управления синхронизацией
 */
class Q {
    int n;
    //начать с недоступного семафора потребителя

    static Semaphore semCon = new Semaphore(0);
    static Semaphore semProd = new Semaphore(1);

    void get() {
        try {
            semCon.acquire();
        } catch (InterruptedException e) {
            System.out.println("Пepexвaчeнo исключение" + "типа InterruptedException");
        }
        System.out.println("Пoлyчeнo: " + n);
        semProd.release();
    }

    void put(int n) {
        try {
            semProd.acquire();
        } catch (InterruptedException e) {
            System.out.println("Пepexвaчeнo исключение " + "типа InterruptedException");
        }
        this.n = n;
        System.out.println("Oтnpaвлeнo: " + n);
        semCon.release();
    }
}



