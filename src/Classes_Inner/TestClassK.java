package Classes_Inner;

public class TestClassK {

    public static void main(String[] args) {
        // используйте оба имени класса
        OuterClassK.NestClass nest = new OuterClassK.NestClass();
        nest.showData();
    }
}
