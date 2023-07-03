package polymorphism.demo_03;

public class ChildClass extends ParentClass {
    public void parentMethod(int i) {
        System.out.println("parentMethod ChildClass" + i);
    }
    public void childMethod(int i) {
        System.out.println("childMethod ChildClass" + i);
    }
    public static void main(String args[]) {
        ParentClass quest = new ChildClass ();   // 1
        quest.parentMethod(1);   // 2
//        quest.childMethod(1);   // 3  Compilation error in line 3  cannot find symbol
        //trying to call a method that belongs only to the subclass using a
        // reference to the superclass through which it cannot be accessed.

    }
}
