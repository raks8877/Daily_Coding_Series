
import java.util.*;

class TestClass {
    static int MOD = (int)1e9+7;
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long ans = 1, val = 0 ;
        for(int i = 0; i < n; i++)
        {
            val = input.nextLong();
            ans = ( (ans%MOD) * (val%MOD)) %MOD;
        }
        System.out.println(ans);

    }
}
