
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
            int ar[] = new int[n+1];
            long dp[] = new long[n+1];
            long maxi = 0;
            
            for(int i = 1; i <= n; i++)
            {
                ar[i] = input.nextInt();
                if(i > 1)
                {
                    if(ar[i] <= k)
                    {
                        dp[i] = dp[i-1] + ar[i];
                    }
                }
                else if(ar[i] <= k)
                {
                    
                    dp[i] = ar[i];
                }
            }
            
            for(int i = 1; i <= n; i++)
            {
                if(dp[i] > maxi)
                    maxi = dp[i];
            }
            System.out.println(maxi);
            
        }
        
        
    }
}
