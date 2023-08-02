package DataType.string;

public class Delete {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Этo простой тест.");
        sb.delete(3, 11);
        System.out.println("Пocлe вызова метода delete(): " + sb);
        sb.deleteCharAt(0);
        System.out.println("Пocлe вызова метода deleteCharAt() :" +  sb);
    }
}
