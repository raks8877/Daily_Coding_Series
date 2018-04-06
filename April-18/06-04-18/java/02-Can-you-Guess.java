
import java.util.*;

class TestClass {
    static int sumFactor(int n)
    {
        int ans = 0;
        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                ans += i;
            }
        }
        return ans;
    }
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            int n = input.nextInt();
            System.out.println(sumFactor(n));
        }
        
        
    }
}
