import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
 
class TestClass { 
    static long MOD = 1000000007;
    public static void main(String args[] ) throws Exception {
       
       Reader input = new Reader();
       PrintWriter pw = new PrintWriter(System.out);
       long dp[][] = new long[10002][102];
        for(int i = 1; i <= 100; i ++)
        {
            dp[0][i] = 1;
        }
        
        for(int k = 1; k <= 100; k++)
        {
            for(int i = 1; i <= 10000; i++)
            {
                for(int j = 1; j <= Math.min(i,k); j++)
                {
                    
                    dp[i][k] += dp[i-j][k];
                    dp[i][k] %= MOD;
                }
            }
        }
        
        int t = input.nextInt();
        while(t-- > 0)
        {
            int x, k;
            x = input.nextInt();
            k = input.nextInt();
            pw.print(dp[x][k]);
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
