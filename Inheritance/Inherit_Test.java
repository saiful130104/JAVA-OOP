//Author : Saiful Islam
package Inheritance;

public class Inherit_Test {
    public static void main(String[] args) {
        Teacher person = new Teacher();
        person.name = "Saiful Islam";
        person.profession = "Teacher";
        person.qualification = "Chairman";
        person.display();
        Person p = new Person();
        p.name = "Tasnim Israt";
        p.profession = "Student";
        //p.qualification = "Chairman";
        p.display();
    }
}
