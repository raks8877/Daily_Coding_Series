import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            int n, k;
            n = input.nextInt();
            k = input.nextInt();
            long dp[] = new long[n+1];
            
            long maxi = 0;
            for(int i = 1; i <= n; i++)
            {
                dp[i] = input.nextLong();
            }
            
            for(int i = 1; i <= n; i++)
            {
                if(i - (k+1) > 0)
                    dp[i] = Math.max(maxi , dp[i] + dp[i-(k+1)]);
                else
                    dp[i] = Math.max(dp[i], maxi);
                if(dp[i] > maxi)
                    maxi = dp[i];
                    
            }
            
            System.out.println(maxi);
            
        }
        
    }
}
