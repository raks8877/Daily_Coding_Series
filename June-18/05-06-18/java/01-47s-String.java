
import java.io.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            String str  = input.readLine();
            int n = str.length(), cnt = 0;
            long ans = 0;
            for(int i = 0; i < n; i++)
            {
                char ch = str.charAt(i);
                if(ch == '$' || ch == '&')
                {
                    ans = ans + (n-i) + ((n-i)*cnt);
                    cnt = 0;
                }
                else
                    cnt += 1;
            }
            System.out.println(ans);
            
        }
        
    }
}
