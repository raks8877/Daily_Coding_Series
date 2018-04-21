
import java.util.*;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
 
class TestClass { 
    
    public static void main(String args[] ) throws Exception {
       
        Reader input = new Reader();
        PrintWriter pw = new PrintWriter(System.out);
        long n;
        n = input.nextLong();
        long cat[] = new long[(int)n];
        long cal[] = new long[(int)n];
        
        for(int i = 0; i < n; i++)
            cat[i] = input.nextLong();
        for(int i = 0; i < n; i++)
            cal[i] = input.nextLong();
        
        Arrays.sort(cat);
        Arrays.sort(cal);
        
        long ans = 0;
        for(long i = n - 1; i >= 0; i--)
        {
            ans += (cat[(int)i]*cal[(int)i]);
        }
        pw.println(ans);
        pw.flush();
       
       
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

