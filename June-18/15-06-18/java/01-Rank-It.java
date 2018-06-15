import java.util.*;

class TestClass {
    static int BS(int ar[], int l, int r, int key)
    {
        int m = 0;
        while(l <= r)
        {
            m = l + (r-l)/2;
            if(ar[m] == key)
                return  m+1;
            else if(key > ar[m])
                l = m + 1;
            else
                r = m - 1;
        }
        return m;
    }
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ar[] = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = input.nextInt();
        Arrays.sort(ar);
        int q = input.nextInt();
        while(q-- > 0)
        {
            int x = input.nextInt();
            System.out.println( BS(ar,0,n-1,x));
        }
    }
}
