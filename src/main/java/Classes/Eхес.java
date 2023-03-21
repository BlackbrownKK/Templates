package Classes;

public class Eхес {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process р = null;
        try {
            р = r.exec("Notepad");
            р.waitFor();

        }catch(Exception е){
                System.out.println("Oшибкa запуска Notepad.");
            }
        System.out.println("Peдaктop Notepad возвратил" + р.exitValue());
        }
    }
