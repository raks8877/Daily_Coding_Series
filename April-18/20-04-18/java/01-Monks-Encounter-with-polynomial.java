
import java.util.*;

class TestClass {
    static long a,b,c;
    static long func(long x)
    {
        return (a*x*x) + (b*x) + c;
    }
    
    static long BS(long k)
    {
        long l = 0, r = 1, m = 0, pos = 0;
        while(true)
        {
            long val = func(r);
            if(val >= k)
                break;
            else
                r = r << 1;
        }
        
        while(l <= r)
        {
            m = l + (r-l)/2;
            long val = func(m);
            if(val < k)
            {
                l = m + 1;
            }
            else
            {
                r = m - 1;
            }
            if(val >= k)
                pos = m;
            
        }
        return pos;
    }
    
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            long k;
            a = input.nextLong();
            b = input.nextLong();
            c = input.nextLong();
            k = input.nextLong();
            System.out.println(BS(k));
        }
        
    }
}
