
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        int n = str.length();
        int ans = 0;
        for(int i = 0; i < n; i++)
        {
            int val = str.charAt(i) - 'a';
            val += 1;
            ans += val;
        }
        System.out.println(ans);
    }
}
