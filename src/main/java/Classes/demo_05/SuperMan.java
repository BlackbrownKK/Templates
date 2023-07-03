package Classes.demo_05;

public class SuperMan extends Person {
    String skills;
    SuperMan(String skills, String name) {
       super();
//       this.name=name; // Clark Kent has super vision
        this.skills = skills;
    }
/*
The field skills will be initialized with the value passed to the constructor of the class SuperMan.
The field name of the superclass Person received a default value because the value has not been passed
from the constructor SuperMan to the superclass constructor.
 */
    public String showInfo() { // null has super vision
        return name + " has " + skills;
    }
}
