package Controls;

public class WhileDoWhile04 {
    public static void main(String[] args) {

        int num = 10;
        while  (++num > 20) {
            num++;
        }
        System.out.println(num);

//        int i = 0;
//        outer: while (i++ < 3) {
//            int j = 0;
//            while (j++ < 5) {
//                if (j == 2) {
//                    continue outer;
//                }
//                System.out.println("i = " + i + "; j = " + j);
//            }
//        }
    }


}
