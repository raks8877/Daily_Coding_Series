
import java.util.*;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
 
class TestClass { 
    
    static int BS1(int ar[],int l, int r, int k)
    {
        int m = 0;
        while(l <= r )
        {
            m = l + (r-l)/2;
            
            if(ar[m] < k)
            {
                if(ar[m+1] >= k)
                    return m+1;
                else
                    l = m + 1;
            }
            else 
                r = m - 1;
        }
        return m;
    }
    
    
    static int BS2(int ar[],int l, int r, int k)
    {
        int m = 0;
        while(l <= r )
        {
            m = l + (r-l)/2;
            if(ar[m] == k)
            {
                if(ar[m+1] > k)
                    return m+1;
                else
                    l = m + 1;
            }
            else if(ar[m] > k)
            {
                if(m-1 >=0 && ar[m-1] < k)
                    return m;
                else
                    r = m - 1;
            }
            else 
                l = m + 1;
        }
        return m;
    }
    
    public static void main(String args[] ) throws Exception {
       
        Reader input=new Reader();
        PrintWriter pw=new PrintWriter(System.out);
        int n = input.nextInt();
        int ar[] = new int[n+1];
        for(int i = 0; i < n; i++)
            ar[i] = input.nextInt();
        ar[n] = Integer.MAX_VALUE;
        Arrays.sort(ar);
        int q = input.nextInt();
        while(q-- > 0)
        {
            int a, x;
            a = input.nextInt();
            x = input.nextInt();
            if(a == 0)
                pw.println(n - BS1(ar,0,n,x));
            else
                pw.println(n - BS2(ar,0,n,x));
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

