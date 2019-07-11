
package Encapsulation;

public class EncapTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Saiful Islam");
        person.setProfession("student");
        person.setAge(23);
        person.setContact(1985298254);
        System.out.println("The information are bellow : ");
        System.out.println("Name : "+person.getName());
        System.out.println("Profession : "+person.getProfession());
        System.out.println("Age : "+person.getAge());
        System.out.println("Contact : "+person.getContact());
    }
}
