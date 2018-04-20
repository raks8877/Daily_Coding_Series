
import java.util.*;


class TestClass {
    
    static int BS(int ar[], int l, int r, int k)
    {
        int m = 0,pos = -1;
        while(l <= r)
        {
            m = l + (r-l)/2;
            
            if(k > ar[m])
            {
                pos = m;
                l = m + 1;
            }
            else
            {
                r = m - 1;
            }
        }
        return pos+1;
    }

    
    static int BSg(int ar[], int l, int r, int k)
    {
        int m = 0,pos = -1;
        while(l <= r)
        {
            m = l + (r-l)/2;
            
            if(k >= ar[m])
            {
                pos = m;
                l = m + 1;
            }
            else
            {
                r = m - 1;
            }
        }
        return pos+1;
    }

    
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n, m;
        n = input.nextInt();
        m = input.nextInt();
        
        int ar1[] = new int[n];
        int ar2[] = new int[m];
        
        for(int i = 0; i < n; i++)
            ar1[i] = input.nextInt();
        
        for(int i = 0; i < m; i++)
            ar2[i] = input.nextInt();
        
        
        
        long val1 = 0 ,val2 = 0;
        
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        
        for(int i = 0; i < n; i++)
        {
            long t1 = BS(ar2,0,m-1,ar1[i]);
            long t2 = m - BSg(ar2,0,m-1,ar1[i]);
            long tmp = t1*t2;
            val1 += tmp;
        }
        
        for(int i = 0; i < m; i++)
        {
            long t1 = BS(ar1,0,n-1,ar2[i]);
            long t2 = n - BSg(ar1,0,n-1,ar2[i]);
            long tmp = t1*t2;
            val2 += tmp;
        }
        long diff = Math.abs(val1-val2);
        
        if(val1 > val2)
            System.out.println("Monk " + diff);
        else if(val1 < val2)
            System.out.println("!Monk " + diff);
        else
            System.out.println("Tie");
        
        
    }
}
