package Lambda.Hillel;

public class Ex1 {
    public static void main(String[] args) {


//        Executable executable = System.out ::println;
//        executable.exe("hello");


//        Executable executable = (String s) -> System.out.println(s);
//        executable.exe("hello");


        Executable executable = (String s) -> {
            String s1 = s.toUpperCase();
            System.out.println(s1);
        };
        executable.exe("hello");


//        Executable exec = new Executable() {
//            @Override
//            public void exe(String str) {
//                System.out.println(str);
//            }
//        };
//
//        exec.exe("hello");


    }
}
