
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            long n, q;
            n = input.nextLong();
            q = input.nextLong();
            long ar[] = new long[(int)n];
            for(int i = 0; i < n; i++)
                ar[i] = input.nextLong();
            
            Arrays.sort(ar);
            long ans = 0;
            for(int i = 0; i < n-1; i++)
            {
                ans += (q*Math.abs(ar[i]-ar[i+1]));
            }
            System.out.println(ans);
        }
        
    }
}
