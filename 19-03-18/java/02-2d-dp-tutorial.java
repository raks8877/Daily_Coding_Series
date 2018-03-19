
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
 
class TestClass { 
    
    public static void main(String args[] ) throws Exception {
       
        Reader input=new Reader();
        PrintWriter pw=new PrintWriter(System.out);
        int n, m;
        n = input.nextInt();
        m = input.nextInt();
        int ar[][] = new int[n][m];
        int dp[][] = new int[n][m];
       
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                ar[i][j] = input.nextInt();
            }
        }
        dp[0][0] = ar[0][0];
        
        for(int i = 1; i < n; i++)
        {
            dp[i][0] = dp[i-1][0] + ar[i][0];
        }
        
        for(int j = 1; j < m; j++)
        {
            dp[0][j] = dp[0][j-1] + ar[0][j];
        }
        
        for(int i = 1; i < n; i++)
        {
            for(int j = 1; j < m; j++)
            {
                dp[i][j] = dp[i-1][j] + dp[i][j-1] + ar[i][j] - dp[i-1][j-1];
            }
        }
        
        int q = input.nextInt();
        while(q-- > 0)
        {
            int x, y;
            x = input.nextInt();
            y = input.nextInt();
            x--;
            y--;
            pw.print(dp[x][y]+"\n");
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



