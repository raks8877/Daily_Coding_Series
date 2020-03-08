
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
 
class TestClass { 
    static long MOD = 1000000007;
    static long fibo(long n)
    {
        long F[][] = new long[][]{{1,1},{1,0}};
        if (n == 0)
            return 0;
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
    
    
    public static void main(String args[] ) throws Exception {
       
       Reader input = new Reader();
       PrintWriter pw = new PrintWriter(System.out);
       long t = input.nextLong();
        while(t-- > 0)
        {
            long n = input.nextLong();
            pw.print( fibo(n+1) );
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



