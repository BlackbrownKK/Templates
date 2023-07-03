package Classes.demo_06;

public class Student extends Person{
    String version1 = "Student";
}
/*
In Java, fields are not polymorphic.

This means that it depends on the reference and not the object type of the field accessed
from outside of the subclass body.

In this case, the class Student has two fields with the name version (its own and inherited).
The field is accessed through a reference to the superclass Person; thus, the inherited field will be used.
 */