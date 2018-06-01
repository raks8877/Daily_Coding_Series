
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

class TestClass {
    static int N = (int)1e6 + 2;
    static int dp[] = new int[N];
    static int cnt = 0;
    
    static void solu(String str1, String str2, int n)
    {
        for(int i = 0; i < n; i++)
        {
            if(str1.charAt(i) != str2.charAt(i))
            {
                dp[i] = 1;
                cnt += 1;
            }
        }
    }
    
    public static void main(String args[] ) throws Exception {
        Reader in = new Reader();
        PrintWriter pw = new PrintWriter(System.out);
        int n, q;
        n = in.nextInt();
        q = in.nextInt();
        
        
        String str1, str2;
        str1 = in.readLine();
        str2 = in.readLine();
        
        solu(str1, str2, n);
        boolean flag = false;
        while(q-- > 0)
        {
            int x = in.nextInt();
            x -= 1;
            if(dp[x] == 1)
            {
                cnt -= 1;
            }
            else 
            {
                if(str1.charAt(x) == '0')
                    flag = true;
            }
            if(cnt == 0 && flag == false)
                pw.println("YES");
            else
                pw.println("NO");
            
            
        }
        
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
        public String readLine() throws IOException
        {
            byte[] buf = new byte[1000005]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }
    }
    
}






