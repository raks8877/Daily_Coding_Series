
import java.util.*;

class TestClass {
    static int N = (int)1e5+5;
    static int TV = (int)1e6+5;
    static int tree[] = new int[2*TV];
    static int ar[] = new int[N];
    
    static void build(int node, int start, int end)
    {
        if(start == end)
        {
            tree[node] = ar[start];
        }
        else
        {
            int mid = start + (end-start)/2;
            build(2*node, start, mid);
            build(2*node+1, mid+1, end);
            tree[node] = Math.min(tree[2*node], tree[2*node+1]);
        }
    }
    
    static void update(int node, int start, int end, int idx, int val)
    {
        if(start == end)
        {
            ar[idx] = val;
            tree[node] = val;
        }
        else
        {
            int mid = start + (end-start)/2;
            if(start <= idx && idx <= mid)
                update(2*node, start, mid, idx, val);
            else
                update(2*node+1, mid+1, end, idx, val);
            tree[node] = Math.min(tree[2*node], tree[2*node+1]);
        }
    }
    
    
    static int query(int node, int start, int end, int l, int r)
    {
        if(r < start || end < l)
            return Integer.MAX_VALUE;
        
        if(l <= start && end <= r)
        {
            return tree[node];
        }
        int mid = start + (end-start)/2;
        int p1 = query(2*node, start, mid, l, r);
        int p2 = query(2*node+1, mid+1, end, l, r);
        return Math.min(p1, p2);
    }
    
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n,q;
        n = input.nextInt();
        q = input.nextInt();
        for(int i = 1; i <= n; i++)
            ar[i] = input.nextInt();
        build(1, 1, n);
        while(q-- > 0)
        {
            char ch;
            int l, r;
            ch = input.next().charAt(0);
            l = input.nextInt();
            r = input.nextInt();
            if(ch == 'q')
            {
                System.out.println(query(1, 1, n, l, r));
            }
            else
            {
                update(1, 1, n, l, r);
            }
        }
    }
}
