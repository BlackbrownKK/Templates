package Classes.classObject;


public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println( person.toString());

        String text = person.getClass().getName();
        System.out.println(text);

        Manager manager =new Manager();
        System.out.println(manager.toString()); // Employee [name=null, salary=null, hireDay=null] [bonus=0]
        System.out.println(manager); // It is the same as System.out.println(boss.toString())
//        Logger.global.info("The current position is " + manager);
    }


}
