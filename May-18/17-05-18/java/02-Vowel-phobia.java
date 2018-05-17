
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            String str = input.readLine();
            int n = str.length();
            int cnt = 0;
            for(int i = 0; i < n; i++)
            {
                if(str.charAt(i) == 'a' ||
                   str.charAt(i) == 'e' ||
                   str.charAt(i) == 'i' ||
                   str.charAt(i) == 'o' ||
                   str.charAt(i) == 'u' 
                   )
                   cnt += 1;
            }
            System.out.println(cnt);
        }
    }
}
