
import java.util.*;

class TestClass {
    static int MOD = (int)1e9+7;
    
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            int n, p;
            n = input.nextInt();
            p = input.nextInt();
            long dp[] = new long[n+1];
            dp[0] = 1;
            
            for(int i = 1; i <= n; i++)
            {
                int j = i - 1;
                while(j >= 0 && i-j <= p)
                {
                    dp[i] += dp[j];
                    dp[i] %= MOD;
                    j--;
                }
            }
            
            System.out.println(dp[n]);
        }
    }
}
