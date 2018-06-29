import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
 
class TestClass { 
    
    public static void main(String args[] ) throws Exception {
       
       Reader input = new Reader();
       PrintWriter pw = new PrintWriter(System.out);
       int t;
       t=input.nextInt();
       while(t-- > 0)
        {
            int n = input.nextInt();
            int ar[] = new int[n];
            for(int i = 0; i < n; i++)
                ar[i] = input.nextInt();
            long sum1 = 0, sum2 = 0;
            int i = 0, j = n -1;
            while(i <= j)
            {
                if(sum1 <= (2*sum2))
                {
                    while((sum1 <= 2*sum2) && i<=j)
                    {
                        sum1+=ar[i];
                        i++;
                    }
                }
                else
                if(sum1>sum2)
                {
                    while((sum1>2*sum2)&&j>=i)
                    {
                        sum2+=ar[j];
                        j--;
                    }
                }
            }
            int a = i;
            int b = n - j - 1;
            pw.println(a + " " + b);
            if(a > b)
                pw.println("Motu");
            else if(a < b)
                pw.println("Patlu");
            else
                pw.println("Tie");
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


