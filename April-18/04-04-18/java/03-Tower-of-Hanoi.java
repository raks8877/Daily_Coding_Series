
import java.util.*;

class TestClass {
    
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            int n = input.nextInt();
            int ar[][] = new int[n][2];
            for(int i = 0 ; i < n; i++)
            {
                int a = input.nextInt();
                int b = input.nextInt();
                ar[i][0] = a;
                ar[i][1] = b;
            }
            Arrays.sort(ar, (a, b) -> Integer.compare(a[0], b[0]));
            
            long dp[] = new long[n+1];
            long maxi = 0;
            for(int i = n-1; i >= 0; i--)
            {
                int r1 = ar[i][0];
                int h1 = ar[i][1];
                dp[i] = h1;
                for(int j = n-1; j > i; j--)
                {
                    int r2 = ar[j][0];
                    int h2 = ar[j][1];
                    if(r2 > r1 && h2 > h1)
                    {
                        dp[i] = Math.max(h1+dp[j], dp[i]);
                    }
                }
                maxi = Math.max(dp[i], maxi);
            }
            System.out.println(maxi);
        }
        
        
    }
}
