
import java.util.*;


class TestClass {
    static long modularExponentiation(long x,long n,long M)
    {
        long result=1;
        while(n>0)
        {
            if(n % 2 ==1)
                result=(result * x)%M;
            x=(x*x)%M;
            n=n/2;
        }
        return result;
    }
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        long a,b;
        a = input.nextLong();
        b = input.nextLong();
        System.out.println(modularExponentiation(a,b,1000000007));
    }
}
