import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value = input.nextDouble();
	//in NumberFormat there is not local currency for india
	//bellow line will make the local currency for india
        Locale indiaLocale = new Locale("en" , "IN");
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: "+us.format(value));
        System.out.println("India: "+india.format(value));
        System.out.println("China: "+china.format(value));
        System.out.println("France: "+france.format(value));
    }
}
