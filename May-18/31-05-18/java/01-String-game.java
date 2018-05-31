
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            String str = input.readLine();
            int n = str.length();
            int ar[] = new int[27];
            for(int i = 0; i < n; i++)
            {
                int val = str.charAt(i) - 'a';
                ar[val] += 1;
            }
            int cnt = 0;
            for(int i = 0; i < 26; i++)
            {
                if(ar[i] > 0)
                    cnt += 1;
            }
            if(cnt % 2 == 0)
                System.out.println("Player2");
            else
                System.out.println("Player1");
        }
        
    }
}
