
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();        
        while(t-- > 0 )
        {
            int n, k, p;
            n = input.nextInt();
            k = input.nextInt();
            p = input.nextInt();
            
            int ar[] = new int[k+2];
            ar[0] = 0;
            for(int i = 1; i <= k; i++)
            {
                ar[i] = input.nextInt();
            }
            ar[k+1] = Integer.MAX_VALUE;
            
            if(p > (n-k))
            {
                System.out.println("-1");
            }
            else
            {
                Arrays.sort(ar);
                for(int i = 1; i <= k+1; i++)
                {
                    int cap = ar[i] - ar[i-1] -1;
                    if(p - cap <= 0)
                    {
                        System.out.println(ar[i-1] + p);
                        break;
                    }
                    else
                    {
                        p -= cap;
                    }
                }
            }
        }
    }
}
