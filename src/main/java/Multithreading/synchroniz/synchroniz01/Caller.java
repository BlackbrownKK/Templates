package Multithreading.synchroniz.synchroniz01;

public class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

//    public void run() {
//        target.call(msg);
//    }

    // синхронизированные вызовы метода call()
    public void run() {
        synchronized(target) {
            // синхронизированный блок
            target.call(msg);
    }
    }


}
