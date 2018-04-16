
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n, m;
        n = input.nextInt();
        m = input.nextInt();
        int adj[][] = new int[n+5][m+5];
        for(int i = 0; i < m; i++)
        {
            int a, b;
            a = input.nextInt();
            b = input.nextInt();
            adj[a][b] = 1;
        }
        int q = input.nextInt();
        while(q-- > 0)
        {
            int a, b;
            a = input.nextInt();
            b = input.nextInt();
            if(adj[a][b] == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
            
        }
    }
}
