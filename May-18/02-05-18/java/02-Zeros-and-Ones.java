
import java.util.*;

class TestClass {
    static int N = (int)1e6+5;
    static int SEG_TREE = 4*N;
    static int tree[] = new int[SEG_TREE];
    
    static void build(int node, int start, int end)
    {
        if(start == end)
            tree[node] = 1;
        else
        {
            int mid = start + (end-start)/2;
            build(2*node, start, mid);
            build(2*node+1, mid+1, end);
            tree[node] = tree[2*node] + tree[2*node+1];
        }
    }
    
    static void update(int node, int start, int end, int idx)
    {
        if(start == idx && end == idx)
        {
            tree[node] = 0;
        }
        else
        {
            int mid = start + (end-start)/2;
            if(start <= idx && idx <= mid)
                update(2*node, start, mid, idx);
            else
                update(2*node+1, mid+1, end, idx);
            tree[node] = tree[2*node] + tree[2*node+1];
        }
    }
    
    static int query(int node, int start, int end, int k, int n)
    {
        if(start < 1 || end > n || tree[node] < k)
            return -1;
        if(start == end && k == 1)
            return start;
        
        int val = tree[node];
        int mid = start + (end-start)/2;
        int left = tree[2*node];
        int right = tree[2*node+1];
        
        if(k > left)
            return query(2*node+1, mid+1, end, k-left, n);
        else
            return query(2*node, start, mid, k, n);
    }
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        build(1, 1, n);
        
        int q = input.nextInt();
        while(q-- > 0)
        {
            int a, x;
            a = input.nextInt();
            x = input.nextInt();
            if(a == 0)
                update(1, 1, n, x);
            else
                System.out.println(query(1, 1, n, x, n));
                
        }
    }
}
