public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str+'!';
        str = str.trim();  
        String st[] = str.split("[ !,?._'@]+");                 
        int sz = st.length;
        System.out.println(sz);
        for(int i=0; i<sz;i++){
            System.out.println(st[i]);
        }
        scan.close();
    }
}