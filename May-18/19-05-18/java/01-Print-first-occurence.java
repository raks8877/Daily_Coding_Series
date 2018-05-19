
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            String str = input.readLine();
            int n = str.length();
            int check[] = new int[26];
            for(int i = 0; i < n; i++)
            {
                int val = str.charAt(i) - 'a';
                if(check[val] == 0)
                {
                    check[val] = 1;
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
