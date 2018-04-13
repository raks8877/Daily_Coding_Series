
import java.util.*;

class TestClass {
    
    static int check(long ar[], long n, long m, long M)
    {
       long cnt = 1, sum = 0;
       for(int i = 0; i < n; i++)
       {
           if(sum + ar[i] > m)
           {
               cnt++;
               sum = ar[i];
           }
           else
           {
               sum += ar[i];
           }
        }
       
        if(cnt <= M)
            return 1;
        else
            return 0;
    }
    static long BS(long ar[], long l, long r, long M, long n)
    {
        long m;
        while(l <= r)
        {
            m = l + (r-l)/2;
            int pos = check(ar,n,m,M);
            if(pos == 1)
                r = m - 1;
            else
                l = m + 1;
        }
        return l;
    }
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        long n, m, maxi = 0;
        n = input.nextLong();
        m = input.nextLong();
        long ar[] = new long[(int)n];
        for(int i = 0; i < n; i++)
        {
            ar[i] = input.nextLong();
            if(ar[i] > maxi)
                maxi = ar[i];
        }
        
        System.out.println(BS(ar,maxi,(long)1e17,m,n));
    }
}
