
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            int n = input.nextInt();
            int dp[] = new int[n+1];
            
            for(int i = 1; i < n; i++)
            {
                dp[i] = input.nextInt();
            }
            
            for(int i = 1; i < n; i++)
            {
                int val = input.nextInt();
                dp[i] = Math.max(dp[i], val);
            }
            int maxi = 0;
            for(int i = n - 1; i >= 1; i--)
            {
                dp[i] = dp[i] - (n-i);
                if(dp[i] > maxi)
                    maxi = dp[i];
            }
            System.out.println(n + maxi);
        }
        
    }
}
