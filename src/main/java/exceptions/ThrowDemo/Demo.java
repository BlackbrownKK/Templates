package exceptions.ThrowDemo;

public class Demo {
    static void demoproc() {
        try {
            throw new NullPointerException("дeмoнcтpaция");
        } catch (NullPointerException е) {
            System.out.println("Иcключeниe перехвачено в теле "
                    + "метода demoproc () . ");
            throw е; // повторно сгенерировать исключение
        }
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Пoвтopный перехват: " + e);
        }
    }
}
