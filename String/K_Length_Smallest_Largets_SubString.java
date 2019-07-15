
package String;

import java.util.Scanner;

public class K_Length_Smallest_Largets_SubString {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str,s1,s2,tmp;
        str = input.nextLine();
        int length = input.nextInt();
        s1 = str.substring(0,length);
        s2 = str.substring(0,length);
        int sz = str.length();
        for(int i=1; i<=sz-length; i++)
        {
            tmp = str.substring(i,i+length);
            if(tmp.compareTo(s1)<0)
                s1 = tmp;
            if(tmp.compareTo(s2)>0)
                s2 = tmp;
        }
        System.out.println(s1+" "+s2);
        
    }
}
