
import java.util.*;

class TestClass {
    static boolean BS(int ar[], int l, int r, int k)
    {
        int m = 0;
        while(l <= r)
        {
            m = l + (r-l)/2;
            if(ar[m] == k)
                return true;
            if(k > ar[m])
                l = m + 1;
            else
                r = m - 1;
        }
        return false;
    }
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n, q;
        n = input.nextInt();
        q = input.nextInt();
        int ar[] = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = input.nextInt();
        Arrays.sort(ar);
        while(q-- > 0)
        {
            int x;
            x = input.nextInt();
            if(BS(ar,0,n-1,x))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
