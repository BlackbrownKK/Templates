package Stream.StreamAPI.Lession18;

public class Pair <T,C>{
private T left;
public C right;

    public Pair() {
        this.left = null;
        this.right = null;
    }

    public Pair(T left, C right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public C getRight() {
        return right;
    }
}

