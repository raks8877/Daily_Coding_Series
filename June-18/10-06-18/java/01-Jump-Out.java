
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = 0;
        for(int i = 0; i < n; i++)
        {
            int tmp = input.nextInt();
            if(ans == 0 && n - tmp - i <= 0)
                ans = i + 1;
        }
        System.out.println(ans);
        
    }
}
