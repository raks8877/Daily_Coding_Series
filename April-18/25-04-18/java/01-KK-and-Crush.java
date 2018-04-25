
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
 
class TestClass { 
    static int N = 100001; 
    public static void main(String args[] ) throws Exception {
       
       Reader input = new Reader();
       PrintWriter pw = new PrintWriter(System.out);
       int t;
       t = input.nextInt();
       while(t-->0)
       {
           int n = input.nextInt();
           int pos[] = new int[N];
           int neg[] = new int[N];
           for(int i = 0; i < n; i++)
           {
                int a = input.nextInt();
                if(a < 0)
                    neg[Math.abs(a)] = 1;
                else
                    pos[a] = 1;
           }
           
           int q = input.nextInt();
           
           for(int i = 0; i < q; i++)
           {
               int x = input.nextInt();
               if(x < 0)
               {
                    if(neg[Math.abs(x)] == 1)
                        pw.println("Yes");
                    else
                        pw.println("No");
               }
               else
               {
                   if(pos[x] == 1)
                        pw.println("Yes");
                    else
                        pw.println("No");
                    
               }
           }
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
