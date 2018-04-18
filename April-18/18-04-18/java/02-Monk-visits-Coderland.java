
import java.util.*;

class TestClass {
    static long check(long c[], long l[], long n)
    {
        long ans = 0;
        long mini = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++)
        {
            ans += (l[i] * Math.min(c[i],mini));
            if(c[i] < mini)
                mini = c[i];
        }
        return ans;
    }
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            long n = input.nextLong();
            long c[] = new long[(int)n];
            long l[] = new long[(int)n];
            
            for(int i = 0; i < n; i++)
                c[i] = input.nextLong();
            for(int i = 0; i < n; i++)
                l[i] = input.nextLong();
            long ans = check(c,l,n);
            System.out.println(ans);
        }
        
        
        
    }
}
