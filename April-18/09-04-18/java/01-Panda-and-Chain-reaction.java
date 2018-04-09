
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        long MOD = (long) 1e6 + 3;
        long dp[] = new long[(int)MOD +1 ];
        dp[0] = 1;
        for(int i = 1; i < MOD; i++)
        {
            dp[i] = (dp[i-1] * i) % MOD;
        }
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            long n, x;
            n = input.nextLong();
            x = input.nextLong();
            if(n >= MOD)
                System.out.println("0");
            else
            {
                x %= MOD;
                long ans = (dp[(int)n] * x) %MOD ;
                
                System.out.println(ans);
            }
        }
        
    }
}
