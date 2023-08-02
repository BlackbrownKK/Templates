package Classes_Inner.read;

public class DemoLocal {
    private int y = 33;
    public Read dest(final String s) {

        class PD implements Read {
            private String label;
            PD(String st ) {
               label = st;
            }
            public String readLabel() {
                return label + y + s;
            }
        }
        return new PD("qqqqq");
    }


    public static void main(String[] str) {
        DemoLocal demoLocal = new DemoLocal();
        Read read = demoLocal.dest("QQQQQ");
        System.out.println(read.readLabel());
    }
}
