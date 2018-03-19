import java.util.*;

class TestClass {
    
    public static int MOD = 1000000007;
    
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner( System.in );
        TestClass obj = new TestClass();
        int n = input.nextInt();
        int ar[] = new int[n];
        int maxi = 0;
        for(int i = 0; i < n; i++)
        {
            ar[i] = input.nextInt();
            if(ar[i] > maxi)
                maxi = ar[i];
        }
        long dp[] = new long[maxi+1];
        dp[0] = 1;
        for(int i = 1; i <= maxi; i++)
        {
            dp[i] = ( (dp[i-1] % MOD) * (i % MOD) ) % MOD;
        }
        
        
        for(int i = 0; i < n; i++)
        {
            System.out.println(dp[ ar[i] ]);
        }
        
    }
}
