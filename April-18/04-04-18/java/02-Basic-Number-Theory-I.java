
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
     
    static long d, x, y;
    static void extendedEuclid(long A, long B) {
        if(B == 0) {
            d = A;
            x = 1;
            y = 0;
        }
        else {
            extendedEuclid(B, A%B);
            long temp = x;
            x = y;
            y = temp - (A/B)*y;
        }
    }
    static long modInverse(long A, long M)
    {
        extendedEuclid(A,M);
        return (x%M+M)%M;    //x may be negative
    }
    
    
    
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        long a, b, c, m;
        a = input.nextLong();
        b = input.nextLong();
        c = input.nextLong();
        m = input.nextLong();
        long ans =( (modularExponentiation(a,b,m)%m) * (modInverse(c,m)%m) )%m;
        System.out.println(ans);
        
    }   
}
