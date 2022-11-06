package Collection;

public class User <T>{

private T value;

    public void print (T value) {
        System.out.println(value);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
