
import java.util.*;

class TestClass {
    static int BS(long ar[], int l, int r, long k)
    {
        int m = 0, pos = 0;
        while(l <= r)
        {
            m = l + (r-l)/2;
            if(k >= ar[m])
            {
                pos = m;
                r = m - 1;
            }
            else
                l = m + 1;
        }
        return pos;
    }
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            int n = input.nextInt();
            long A[] = new long[n];
            long B[] = new long[n];
            for(int i = 0; i < n; i++)
                A[i] = input.nextLong();
            for(int i = 0; i < n; i++)
                B[i] = input.nextLong();
            int val = 0;
            for(int i = n -1; i >= 0; i--)
            {
                int tmp = BS(A,0,n-1,B[i]);
                if(B[i] >= A[tmp])
                    val = Math.max(val, i-tmp);
            }
            System.out.println(val);
        }
    }
}
