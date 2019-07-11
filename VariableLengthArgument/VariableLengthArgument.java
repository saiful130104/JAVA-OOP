
package oop_full_package;

public class VariableLengthArgument {
    //it works like an array
    void add(int ... num){
        int sum=0;
        for(int x : num){
            sum+=x;
        }
        System.out.println("The summation is : "+sum);
    }
    void add(double ... num){
        double sum=0;
        for(double x : num){
            sum+=x;
        }
        System.out.println("The summation is : "+sum);
    }
}
