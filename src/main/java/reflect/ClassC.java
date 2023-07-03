package reflect;

import Pattern.Singleton.User;

public class ClassC {
    private static ClassC classC;

    private ClassC() {
    }

    public void hello(String name) {
        System.out.println("Hello" + name);
    }

    public static ClassC getInstance() {
        if (classC == null) classC = new ClassC();
        return classC;
    }
}
