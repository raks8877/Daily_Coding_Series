
import java.io.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            String str = input.readLine();
            int n = str.length();
            int cnt[] = new int[27];
            
            for(int i = 0; i < n; i++)
            {
                cnt[str.charAt(i) - 'a'] += 1;
            }
            
            boolean flag = true;
            
            for(int i = 0; i < 26; i++)
            {
                if(cnt[i]% 2 != 0)
                {
                    flag = false;
                    break;
                }
            }
            
            if(flag)
                System.out.println("1");
            else
                System.out.println("-1");
        }
        
    }
}
