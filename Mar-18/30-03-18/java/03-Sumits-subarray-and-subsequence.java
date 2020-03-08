
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            int n = input.nextInt();
            int ar[] = new int[n+1];
            int dp[] = new int[n+1];
            
            for(int i = 1; i <= n; i++)
            {
                ar[i] = input.nextInt();
                dp[i] = ar[i];
            }
            
            int maxi = Integer.MIN_VALUE, non_conti = 0;
            for(int i = 1; i <= n; i++)
            {
                dp[i] = Math.max(dp[i-1] + ar[i], ar[i]);
                if(dp[i] > maxi)
                    maxi = dp[i];
                if(ar[i] > 0)
                    non_conti += ar[i];
            }
            
            //All negative numbers
            if(non_conti == 0)
                non_conti = maxi;
            
            System.out.println(maxi + " " + non_conti);
        }
    }
}
