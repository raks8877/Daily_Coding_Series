import java.util.*;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
 
class TestClass { 
    
    public static void main(String args[] ) throws Exception {
       
       Reader input=new Reader();
       PrintWriter pw=new PrintWriter(System.out);
       int t;
       t=input.nextInt();
       while(t-->0)
       {
           int n = input.nextInt();
            int ar[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                ar[i] = input.nextInt();
            }
            
            Stack<Integer> st = new Stack<Integer>();
            st.push(0);
            
            int val[] = new int[n];
            val[0] = 1;
            
            for(int i = 1; i < n; i++)
            {
                while(!st.empty() && ar[st.peek()] <= ar[i])
                    st.pop();
                val[i] = (st.empty())? (i + 1) : (i - st.peek());
                st.push(i);
            }
            for(int i = 0; i < n; i++)
            {
                pw.print(val[i] + " ");
            }
            pw.print("\n");
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
