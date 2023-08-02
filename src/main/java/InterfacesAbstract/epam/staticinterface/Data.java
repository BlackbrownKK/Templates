package InterfacesAbstract.epam.staticinterface;

public interface Data {
    default void print(String str) {
        if ( !isNull(str) ) {
            System.out.println("Data. Prints lines: " + str);
        }
    }
    static boolean isNull(String str) {
        System.out.println("Static method null checking");
//        static boolean isNull(String str) {
//            return str == null ? true : "".equals(str.trim()) ? true : false;
//        }
        if (str == null) {
            return true;
        } else {
            if ("".equals(str.trim())) return true;
            return false;
        }
    }

}
