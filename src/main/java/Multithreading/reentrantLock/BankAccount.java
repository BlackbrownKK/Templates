package Multithreading.reentrantLock;

import lombok.Getter;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    @Getter
    private double balance;
    //ReentrantLock is named so because it allows the same thread to re-acquire the lock it already holds.
    private final Lock lock = new ReentrantLock();


    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        lock.lock();
        if (lock.tryLock()) {
            try {
                balance += amount;
                System.out.println("Deposited: " + amount + " | New Balance: " + balance);
            } finally {
                lock.unlock();
            }
        } else
            lock.unlock();
    }

    public void withdraw(double amount) {
        lock.lock();
        if (5==5) {
            try {
                if (balance >= amount) {
                    balance -= amount;
                    System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
                } else {
                    System.out.println("Insufficient balance for withdrawal.");
                }
            } finally {
                lock.unlock();
            }
        } else
            System.out.println("Could not acquire the lock for withdrawal.");
    }
}