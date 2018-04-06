
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            int n = input.nextInt();
            int ar1[] = new int[n+1];
            int ar2[] = new int[n+1];
            int cost1[] = new int[n+1];
            int cost2[] = new int[n+1];
            for(int i = 1; i <= n; i++)
                ar1[i] = input.nextInt();
            for(int i = 1; i <= n; i++)
                ar2[i] = input.nextInt();
            
            for(int i = 2; i <= n; i++)
                cost1[i] = input.nextInt();
            for(int i = 2; i <= n; i++)
                cost2[i] = input.nextInt();
            
            int dp1[] = new int[n+1];
            int dp2[] = new int[n+1];
            dp1[1] = ar1[1];
            dp2[1] = ar2[1];
            
            for(int i = 2; i <= n; i++)
            {
                dp1[i] = Math.min(dp1[i-1] + ar1[i], dp2[i-1] + ar1[i] + cost2[i]);
                dp2[i] = Math.min(dp2[i-1] + ar2[i], dp1[i-1] + ar2[i] + cost1[i]);
                
            }
            System.out.println(Math.min(dp1[n] , dp2[n]));
        }
        
    }
}
