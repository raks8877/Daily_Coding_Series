
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int l, r, k;
        l = input.nextInt();
        r = input.nextInt();
        k = input.nextInt();
        
        int ans = (r/k) - (l-1)/k;
        System.out.println(ans);
    }
}
