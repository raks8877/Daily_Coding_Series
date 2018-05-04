
import java.util.*;

class TestClass {
    static long findsum(int ar[], int n, int v1, int v2)
    {
        
        long sum = 0, modi_sum = 0, ans;
        long m1, m2;
        m1 = n;
        m2 = v2;
        ans = m1 * m2;
        
        for(int i = 0; i < n; i++)
        {
            sum += Math.abs(ar[i]);
            modi_sum += Math.abs(ar[i] + v1);
        }
        return Math.max(sum, Math.max(modi_sum, ans));
    }
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n, m;
        n = input.nextInt();
        m = input.nextInt();
        int ar[][] = new int[n][m];
        int colmaj[][] = new int[m][n];
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                ar[i][j] = input.nextInt();
                colmaj[j][i] = ar[i][j];
            }
        }
        
        int v1, v2, v3, v4;
        v1 = input.nextInt();
        v2 = input.nextInt();
        v3 = input.nextInt();
        v4 = input.nextInt();
        
        long row = 0, col = 0;
        
        for(int i = 0; i < n; i++)
        {
            row += findsum(ar[i], m, v1, v2);
        }
        for(int j = 0; j < m; j++)
        {
            col += findsum(colmaj[j], n, v3, v4);
        }
        
        System.out.println(Math.max(col, row));
        
    }
}
