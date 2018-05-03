

import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
 
class TestClass { 
    static int N = (int) 1e5 + 5;
    static int SEG_TREE = 4*N;
    static long ar[] = new long[N];
    static long tree[] = new long[SEG_TREE];
    
    static long MOD = 1000000007;
    static long fibo(long n)
    {
        long F[][] = new long[][]{{1,1},{1,0}};
        if (n == 0)
            return 1;
        power(F, n);
         
       return F[0][0];
    }
      
    static void multiply(long F[][], long M[][])
    {
        long x = ( ( (F[0][0]%MOD)*(M[0][0]%MOD) ) + ( (F[0][1]%MOD)*(M[1][0]%MOD) ) ) %MOD;
        long y = ( ( (F[0][0]%MOD)*(M[0][1]%MOD) ) + ( (F[0][1]%MOD)*(M[1][1]%MOD) ) ) %MOD ;
        long z = ( ( (F[1][0]%MOD)*(M[0][0]%MOD) ) + ( (F[1][1]%MOD)*(M[1][0]%MOD) ) ) %MOD;
        long w = ( ( (F[1][0]%MOD)*(M[0][1]%MOD) ) + ( (F[1][1]%MOD)*(M[1][1]%MOD) ) ) %MOD ;
            
        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;
    }
 
    static void power(long F[][], long n)
    {
        if( n == 0 || n == 1)
          return;
        long M[][] = new long[][]{{1,1},{1,0}};
          
        power(F, n/2);
        multiply(F, F);
          
        if (n%2 != 0)
           multiply(F, M);
    }
    static long GCD(long a, long b)
    {
        if(b == 0)
            return a;
        else
            return GCD(b, a%b);
    }
    
    static int MID(int a, int b)
    {    
        return a + (b-a)/2;
    }
    
    static void build(int node, int start, int end)
    {
        if(start == end)
        {
            tree[node] = ar[start];
        }
        else
        {
            int mid = MID(start, end);
            build(2*node, start, mid);
            build(2*node+1, mid+1, end);
            tree[node] = GCD(tree[2*node], tree[2*node+1]);
        }
    }
    
    static long query(int node, int start, int end, int l, int r)
    {
        if(r < start || end < l)
            return 0;
        if(l <= start && end <= r)
            return tree[node];
        int mid = MID(start, end);
        long p1 = query(2*node, start, mid, l, r);
        long p2 = query(2*node+1, mid+1, end, l, r);
        return GCD(p1,p2);
    }
    public static void main(String args[] ) throws Exception {
        
        Reader input = new Reader();
        PrintWriter pw = new PrintWriter(System.out);
        int n, q;
        n = input.nextInt();
        q = input.nextInt();
        
        for(int i = 1; i <= n; i++)
            ar[i] = input.nextLong();
        
        build(1, 1, n);
        
        while(q-- > 0)
        {
            int l, r;
            l = input.nextInt();
            r = input.nextInt();
            
            pw.println(fibo( query(1, 1, n, l, r) - 1 ));
            pw.flush();  
        }
        
        
    }
    
    
    
    static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
 
        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');
 
            if (neg)
                return -ret;
            return ret;
        }
        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');
 
            if (neg)
                return -ret;
            return ret;
        }
        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
 
        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
 
        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }
    
    
}



