
package Inheritance;

public class Teacher extends Person {
    String qualification;
    void display(){
        System.out.println("Name : "+name);
        System.out.println("profession : "+profession);
        System.out.println("Qualification : "+qualification);
    }
}
