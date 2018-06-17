
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        n = n * 2;
        int ar[] = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = input.nextInt();
        Arrays.sort(ar);
        int ans = 0;
        for(int i = 0; i < n; i+=2)
            ans += ar[i];
        System.out.println(ans);
        
    }
}
