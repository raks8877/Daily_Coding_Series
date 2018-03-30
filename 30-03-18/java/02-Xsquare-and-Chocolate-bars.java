import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        
        while(t-- > 0)
        {
            String str = input.readLine();
            int n = str.length();
            int dp[] = new int[n+1];
            int maxi = 0;
            for(int i = 2; i < n; i++)
            {
                if( str.charAt(i) == str.charAt(i-1) &&  str.charAt(i) == str.charAt(i-2) )
                    dp[i] = 0;
                else
                    dp[i] = (i-3>0? dp[i-3] : 0) +1;
                
                if(dp[i] > maxi)
                    maxi = dp[i];
            }
            maxi *= 3;
            System.out.println(n - maxi);
        }
        
    }
}
