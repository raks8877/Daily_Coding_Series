import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
 
class TestClass { 
    
    public static void main(String args[] ) throws Exception {
        Reader in=new Reader();
        PrintWriter pw=new PrintWriter(System.out);
       
        int n= in.nextInt();
        int ar[]=new int[n+1];
        int sum=0;
        
        for(int i=1;i<=n;i++)
        {
            ar[i]=in.nextInt();
            sum+=ar[i];
        }
        
        int ans[]=new int[n+1];
        int lastDigit=0;
        for(int i=1;i<=n;i++)
        {
            int currSum=sum-ar[i];
            if(i!=n)
                lastDigit=ar[i-1]+ar[n];
            else
                lastDigit=ar[i-1];
            if(currSum%3==0 && lastDigit%10==0)
                ans[i]=ans[i-1]+1;
            else
                ans[i]=ans[i-1];
        }
        int q=in.nextInt();
        while(q-->0)
        {
            int l,r;
            l=in.nextInt();
            r=in.nextInt();
            pw.print(ans[r]-ans[l-1]);
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
