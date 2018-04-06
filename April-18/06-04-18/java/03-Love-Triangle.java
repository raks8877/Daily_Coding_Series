
import java.util.*;

class TestClass {
    static long solve(long n)
    {
        if(n < 9)
            return n;
        return n % 9 + (10 * solve(n / 9));
        
    }
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        while(input.hasNext())
        {
            long n = input.nextLong();
            System.out.println(solve(n));
        }
    }
}
