
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long mini = (long)1e18, maxi = 0;
        
        for(int i = 0; i < n; i++ )
        {
            long val = input.nextLong();
            mini = Math.min(mini, val);
            maxi = Math.max(maxi, val);
        }
        System.out.println(mini+maxi);
    }
}
