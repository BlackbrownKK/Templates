package Multithreading.readWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedResource {

    /*
SharedResource represents a shared resource with a data field that can be read or written.
Multiple reader threads are created, each using the readData method to read the shared data
 using the read lock. This allows multiple readers to access the resource simultaneously.

A writer thread is created to update the shared data using the write lock.
The write lock ensures that only one thread can write to the resource at a time.

The ReentrantReadWriteLock is used to manage the read and write locks.
     */
    private int data = 0;
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public int readData() {
        readWriteLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is reading data: " + data);
            return data;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public void writeData(int newValue) {
        readWriteLock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is writing data: " + newValue);
            data = newValue;
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }
}
