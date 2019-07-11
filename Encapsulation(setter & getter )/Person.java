
package Encapsulation;

public class Person {
    private String name,profession;
    private int age,contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
    
//    void setter(String name, String profession, int age, int contact){
//        this.name = name;
//        this.profession = profession;
//        this.age = age;
//        this.contact = contact;
//    }
//    
//    void getter(){
//        System.out.println("Name : "+name);
//        System.out.println("profession : "+profession);
//        System.out.println("Age : "+age);
//        System.out.println("Contact : "+contact);
//    }
}
