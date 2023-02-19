package Multithreading;

public class CurrentThreadDemo {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println("Teкyщий поток исполнения: " + t);
    // изменить имя потока исполнения
        t.setName("Му Thread");
        System.out.println("Пocлe изменения имени потока: "
                + t);
        try {
            for (int n = 5; n > 0; n--)
                System.out.println(n);
            Thread.sleep(10000);
        } catch (InterruptedException е) {
            System.out.println(
                    "Главный поток исполнения прерван");
        }
    }
}
