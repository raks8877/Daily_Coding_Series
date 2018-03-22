
import java.util.*;
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            String str = input.next().toLowerCase();
            int len = str.length();
            int cnt = 0;
            
            for(int i = 0; i < len; i++)
            {
                if(str.charAt(i) == 'a' ||
                   str.charAt(i) == 'e' ||
                   str.charAt(i) == 'i' ||
                   str.charAt(i) == 'o' ||
                   str.charAt(i) == 'u' 
                   )
                   cnt++;
            }
            System.out.println(cnt);
        }
        
    }
}
