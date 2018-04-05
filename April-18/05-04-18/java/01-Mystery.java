
import java.util.*;

class TestClass {
    
    static Vector prime = new Vector();
    static void seive()
    {
        int n = 100000000;
        n = (int)Math.sqrt(n);
        int ar[] = new int[n+1];
        for(int i = 2; i <= n; i++)
        {
            if(ar[i] == 0)
            {
                prime.add(i);
                for(int j = 2*i; j <=n ; j+=2)
                {
                    ar[j] = 1;
                }
            }
        }
    }
    static int factors(int n)
    {
        int ans = 1;
        Enumeration vEnum = prime.elements();
        int tmp = n;
        while(vEnum.hasMoreElements())
        {   
            int pri = (int)vEnum.nextElement();
            if(pri > n || tmp == 0)
                break;
            int cnt = 0;
            boolean flag = false;
            while(tmp % pri == 0)
            {
                cnt++;
                tmp /= pri;
                flag = true;
            }
            if(flag)
                ans = ans * (cnt + 1);
        }
        if(tmp > 2)
            ans *= 2;
        return ans;
    }
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        seive();
        int t = input.nextInt();        
        while(t-- > 0)
        {
            int n = input.nextInt();
            System.out.println(factors(n));
        }
    }
}
