
package oop_full_package;


public class MainVariableLengthArgument {
    public static void main(String[] args) {
        VariableLengthArgument obj = new VariableLengthArgument();
        obj.add(10,20);
        obj.add(10,20,30);
        obj.add(10,20,30,40);
        obj.add(10,20,30,40,50);
	obj.add(10,20.5);
        obj.add(10,20,30.5);
        obj.add(10,20,30,40.5);
        obj.add(10,20,30,40,50.5);
    }
}
