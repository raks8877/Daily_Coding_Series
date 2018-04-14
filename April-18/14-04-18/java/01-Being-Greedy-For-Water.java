
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            int n, x;
            n = input.nextInt();
            x = input.nextInt();
            int ar[] = new int[n];
            for(int i = 0; i < n; i++)
                ar[i] = input.nextInt();
            Arrays.sort(ar);
            int cnt = 0;
            for(int i = 0; i < n; i++)
            {
                if(x- ar[i] < 0)
                    break;
                else
                {
                    cnt++;
                    x -= ar[i];
                }
            }
            System.out.println(cnt);
        }
    }
}
