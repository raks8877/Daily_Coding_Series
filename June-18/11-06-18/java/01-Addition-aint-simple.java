
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            String str = input.readLine();
            int n = str.length();
            for(int i = 0; i < n; i++)
            {
                int v1 = str.charAt(i) - 'a';
                int v2 = str.charAt(n-i-1) - 'a';
                int v = (v1 + v2 + 1) %  26;
                System.out.print((char)('a'+v));
            }
            System.out.println();
        }
    }
}
