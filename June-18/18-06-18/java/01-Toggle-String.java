
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        int n = str.length();
        
        for(int i = 0; i < n; i++)
        {
            int val = str.charAt(i) - 'a';
            if(val >= 0 && val <= 26)
                System.out.print((char) ('A' + val));
            else
            {
                val = str.charAt(i) - 'A';
                System.out.print((char) ('a' + val));
            }
        }
    }
}
