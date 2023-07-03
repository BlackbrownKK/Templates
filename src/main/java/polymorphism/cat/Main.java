package polymorphism.cat;

public class Main {
    /*
    When trying to cast an object to a class not included in the inheritance hierarchy
    of the source object, a ClassCastException exception will be thrown.
     */
    public static void main(String[] arg) {
        // create the reference cat of the type Cat and initialize it with the object of the class BritishCat.
        Cat cat = new BritishCat();
        // then cast the reference cat to the type BritishCat, everything will be executed correctly since the object
        // is the same.  We will get an execution error—ClassCastException.
        BritishCat cat2 = (BritishCat)cat;
        PersianCat cat3 = (PersianCat)cat;
        //  because the types BritishCat and PersianCat are located in different inheritance branches.
//
//        if (cat instanceof PersianCat) {
//            System.out.println("Persian cat!");
//            PersianCat cat3 = (PersianCat) сat;
//        } else {
//            System.out.println("Not Persian cat!");
//        }

    }

}
