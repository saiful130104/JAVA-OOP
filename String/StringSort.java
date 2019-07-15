
package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class StringSort {

    static boolean isAnagram(String a, String b) {
       String str,str1;
        str = a;
        str1 = b;
        str = str.toLowerCase();
        str1 = str1.toLowerCase();
        System.out.println("Str : "+str);
        System.out.println("Str1 : "+str1);
        if(str.length()!=str1.length())
            return false;
        java.util.HashMap<Character,Integer>mp;
        mp = new java.util.HashMap<>();
        int sz = str.length();
        char ch;
        for(int i=0; i<sz; i++){
            ch = str.charAt(i);
            if(!mp.containsKey(ch))
                mp.put(ch,1);
            else
                mp.put(ch,mp.get(ch)+1);
        }
        for(int i=0; i<sz; i++){
            ch = str1.charAt(i);
            System.out.println("Char : "+ch+mp.get(ch));
            if(!mp.containsKey(ch))
                return false;
            if(mp.get(ch)==0)
                return false;
            mp.put(ch,mp.get(ch)-1);
        }
   
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
