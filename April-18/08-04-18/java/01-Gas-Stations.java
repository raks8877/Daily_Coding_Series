
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n; long x;
        n = input.nextInt();
        x = input.nextLong();
        long ar[] = new long[n+1];
        for(int i = 1; i <= n; i++)
        {
            ar[i] = input.nextLong();
            if(i > 1)
                ar[i] += ar[i-1];
        }
        int ans = 0;
        for(int i = 1; i <= n; i++)
        {
            if(ar[i] >= x)
            {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
        
    }
}
