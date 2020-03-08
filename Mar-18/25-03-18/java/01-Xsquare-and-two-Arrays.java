
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int q = input.nextInt();
        
        int ar1[] = new int[n+1];
        int ar2[] = new int[n+1];
        long dp1[] = new long[n+1];
        long dp2[] = new long[n+1];
        
        for(int i = 1; i <= n; i++)
            ar1[i] = input.nextInt();
        for(int i = 1; i <= n; i++)
            ar2[i] = input.nextInt();
        
        for(int i = 1; i <= n; i++)
        {
            if(i%2==0)
            {
                dp1[i] = dp1[i-1] + ar2[i];
                dp2[i] = dp2[i-1] + ar1[i];
            }
            else
            {
                dp1[i] = dp1[i-1] + ar1[i];
                dp2[i] = dp2[i-1] + ar2[i];
            }
        }
        
        while(q-- > 0)
        {
            int a, x, y;
            a = input.nextInt();
            x = input.nextInt();
            y = input.nextInt();
            if(a == 1)
            {
                if(x % 2 != 0)
                {
                    System.out.println(dp1[y] - dp1[x-1]);
                }
                else
                {
                    System.out.println(dp2[y] - dp2[x-1]);
                }
            }
            else
            {
                if(x % 2 == 0)
                {
                    System.out.println(dp1[y] - dp1[x-1]);
                }
                else
                {
                    System.out.println(dp2[y] - dp2[x-1]);
                }
            }
        }
        
        
    }
}
