
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
 
class TestClass { 
    
    public static void main(String args[] ) throws Exception {
       
       Reader input = new Reader();
       PrintWriter pw = new PrintWriter(System.out);
       int t;
       t = input.nextInt();
       while(t-->0)
       {
            int n;
            n = input.nextInt();
            long ar[] = new long[n];
            long sad =  0;
            long max1 = 0, max2 = 0; 
            for(int i = 0; i < n; i++)
            {
                long a, b;
                a = input.nextLong();
                b = input.nextLong();
                sad += b;
                ar[i] = a+b;
                if(ar[i] > max1)
                {   
                    max2 = Math.max(max2, max1);
                    max1 = ar[i];
                    
                }
                if(ar[i] < max1 && ar[i] > max2)
                    max2 = ar[i];
            }
            
            long ans = max1 + max2 - sad;
            
            pw.println(ans);
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
