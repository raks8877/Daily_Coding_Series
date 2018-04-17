
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t;
        t = input.nextInt();
        while(t-- > 0)
        {
            int e = input.nextInt();
            int hash[] = new int[10002];
            int cnt = 0;
            while(e-- > 0)
            {
                int a = input.nextInt();
                int b = input.nextInt();
                if(hash[a] == 0)
                {
                    hash[a] = 1;
                    cnt++;
                }
                if(hash[b] == 0)
                {
                    hash[b] = 1;
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
