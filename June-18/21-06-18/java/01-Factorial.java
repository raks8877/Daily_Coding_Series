
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long ans = 1;
        for(int i = 1; i <= n; i++)
            ans *= i;
        System.out.println(ans);
    }
}
