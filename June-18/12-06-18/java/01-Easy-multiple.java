
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            int n = input.nextInt();
            n  -= 1;
            long x = n / 3;
            long y = n / 5;
            long z = n / 15;
            
            long s1 = 3 * (x * (x+1))/ 2;
            long s2 = 5 * (y * (y+1))/ 2;
            long s3 = 15 * (z * (z+1))/ 2;
            long ans = s1 + s2 - s3;
            System.out.println(ans);
        }
        
    }
}
