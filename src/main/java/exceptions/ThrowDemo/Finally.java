package exceptions.ThrowDemo;

public class Finally {

    // сгенерировать исключение в методе
    static void procA() {
        try {
            System.out.println("B теле метода procA()");
            throw new RuntimeException("дeмoнcтpaция");
        } finally {
            System.out.println(
                    "Блок оператора finally в методе procA()");
        }
    }

    // возвратить управление из блока оператора try
    static void procB() {
        try {
            System.out.println("B теле метода procB() ");
            return;
        } finally {
            System.out.println(
                    "Блок оператора finally в методе procB() ");
        }
    }

    // выполнить блок try, как обычно
    static void procC() {
        try {
            System.out.println("B теле метода procC() ");
        } finally {
            System.out.println(
                    "Блок оператора finally в методе procC()");
        }
    }

    public static void main(String args[]) {
        try {
            procA();
        } catch (Exception е) {

            System.out.println("Иcключeниe перехвачено");
        }
        procB();
        procC();
    }
}
