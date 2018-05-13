
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        int n = str.length();
        int flag[] = new int[26];
        for(int i = 0; i < n; i++)
        {
            int val = str.charAt(i) - 'a';
            if(flag[val] == 0)
            {
                System.out.print(str.charAt(i));
                flag[val] = 1;
            }
            else
                continue;
        }
    }
}
