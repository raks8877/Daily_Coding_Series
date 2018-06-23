
import java.util.*;
import java.io.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        Reader input = new Reader();
       PrintWriter pw = new PrintWriter(System.out);
       
        int t = input.nextInt();
        while(t-- > 0)
        {
            int n = input.nextInt();
            int ar[] = new int[n];
            for(int i = 0; i < n; i++)
                ar[i] = input.nextInt();
            Arrays.sort(ar);
            
            for(int i = n-1; i >= 0; i--)
                pw.print(ar[i] + " ");
            pw.println();
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
