

import java.util.*;

class TestClass {
    static Vector vec = new Vector();
    static int dp[] = new int[10001];
    static void seive()
    {
        int n = 10000;
        int check[] = new int[n+1];
        for(int i = 2; i <= n; i++)
        {
            if(check[i] == 0)
            {
                vec.add(i);
                for(int j = 2*i; j <= n; j += i)
                {
                    check[j] = 1;
                }
                dp[i] = 1;
                if(i <= 5)
                {
                    int val = (int)Math.pow(i,i);
                    dp[val] = 1;
                }
            }
        }
    }
    
    static void solve()
    {
        int n = 10000;
        dp[0] = dp[1] = n+1;
        for(int i = 2; i <= n; i++)
        {
            if(dp[i] != 1)
            {
                dp[i] = n+1;
                Enumeration vEnum = vec.elements();
                while(vEnum.hasMoreElements())
                {   
                    int val = (int)vEnum.nextElement();
                    if(val > i)
                        break;
                    if(i-val >= 0)
                        dp[i] = Math.min(dp[i-val] + 1, dp[i]);
                    if(val <= 5)
                    {
                        val = (int)Math.pow(val,val);
                        if(i-val >=0 )
                            dp[i] = Math.min(dp[i-val] + 1, dp[i]);
                    }
                    
                }
            }
        }
    }
    public static void main(String args[] ) throws Exception {
        seive();
        solve();
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            int n = input.nextInt();
            System.out.println(dp[n]);
        }
    }
}
