
import java.util.*;

class TestClass {
    static int MOD = (int)1e9 + 7;
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            int n = input.nextInt();
            long ar[] = new long[n];
            for(int i = 0; i < n; i++)
                ar[i] = input.nextLong();
            
            Arrays.sort(ar);
            long maxi = ar[n-1], diff = 0, ans = 0, val = n - 1;
            
            for(int i = n - 1; i >= 0; i--)
            {
                diff += (val * ar[i]);
                val -= 2;
            }
            ans = ( (diff%MOD)* (maxi%MOD) )%MOD;
            System.out.println(ans);
        }
        
    }
}
