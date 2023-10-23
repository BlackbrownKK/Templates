package debagger;

public class intro {
    public static void main(String[] args) {
        System.out.println(  m(3,88));
    }

    public static int m(int f, int g) {
        try {
            int[] far = new int[f];
            far[g] = 1;
            return f;
        } catch(IndexOutOfBoundsException e) {
            return (m(g, 0) == 0) ? f : g;
        }
    }
}
