import java.util.*;

class TestClass {
    static int MOD = 1000000007;
    
    static long fibo(long n)
    {
        long F[][] = new long[][]{ {1,1}, {1,0} };
        if(n == 0 || n == 1)
            return 1;
        power(F,n);
        return F[0][0];
    }
    
    static void power(long F[][], long n)
    {
        long M[][] = new long[][]{ {1,1}, {1,0} };
        if(n == 0 || n == 1)
            return;
        power(F, n / 2);
        multiply(F,F);
        if(n % 2 != 0)
            multiply(F,M);
    }
    static void multiply(long F[][], long M[][])
    {
        long a = ( (F[0][0]%MOD) * (M[0][0]%MOD) + (F[0][1]%MOD) * (M[1][0]%MOD) ) % MOD;
        long b = ( (F[0][0]%MOD) * (M[0][1]%MOD) + (F[0][1]%MOD) * (M[1][1]%MOD) ) % MOD;
        
        long c = ( (F[1][0]%MOD) * (M[0][0]%MOD) + (F[1][1]%MOD) * (M[1][0]%MOD) ) % MOD;
        long d = ( (F[1][0]%MOD) * (M[0][1]%MOD) + (F[1][1]%MOD) * (M[1][1]%MOD) ) % MOD;
        
        F[0][0] = a;
        F[0][1] = b;
        F[1][0] = c;
        F[1][1] = d;
    }
    
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println( fibo(n-1) );
    }
}
