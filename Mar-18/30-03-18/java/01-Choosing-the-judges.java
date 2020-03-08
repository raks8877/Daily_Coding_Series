import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int x = 1; x <= t; x++)
        {
            int n = input.nextInt();
            int ar[] = new int[n+1];
            long dp[] = new long[n+1];
            for(int i =1; i <= n; i++)
            {
                ar[i] = input.nextInt();
            }
            long maxi;
            dp[1] = maxi = ar[1];
            
            for(int i = 2; i <= n; i++)
            {
                dp[i] = Math.max( dp[(i-2)>0?(i-2):0] + ar[i] , dp[(i-3)>0?(i-3):0] + ar[i] );
                if(dp[i] > maxi)
                    maxi = dp[i];
            }
            System.out.println("Case " + x + ": " + maxi);
            
        }
        
    }
}
