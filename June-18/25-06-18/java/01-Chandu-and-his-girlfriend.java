
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
 
class TestClass { 
    
    
    
    public static void main(String args[] ) throws Exception {
       
       Reader input = new Reader();
       PrintWriter pw = new PrintWriter(System.out);
       int t;
       t = input.nextInt();
       while(t-->0)
       {
            int n, m;
            n = input.nextInt();
            m = input.nextInt();
            int ar[] = new int[n+m];
            
            for(int i = 0; i < n; i++)
                ar[i] = input.nextInt();
            for(int i = n; i < n+m; i++)
                ar[i] = input.nextInt();
            
            merge(ar, 0, n-1, n+m-1);
            
            for(int i = 0; i < n+m; i++)
                pw.print(ar[i] + " ");
            pw.println();
            pw.flush();
            
            
       }
       
    }
    
    //this func is taken from pbirla29 
    static void merge(int A[ ] , int start, int mid, int end) {
        //stores the starting position of both parts in temporary variables.
        int p = start ,q = mid+1;
 
        int Arr[] = new int[end-start+1] , k=0;
 
        for(int i = start ;i <= end ;i++) {
            if(p > mid)      //checks if first part comes to an end or not .
                Arr[ k++ ] = A[ q++] ;
 
            else if ( q > end)   //checks if second part comes to an end or not
                Arr[ k++ ] = A[ p++ ];
 
            else if( A[ p ] >= A[ q ])     //checks which part has smaller element.
                Arr[ k++ ] = A[ p++ ];
 
            else
                Arr[ k++ ] = A[ q++];
        }
        for (p=0 ; p< k ;p ++) {
           /* Now the real array has elements in sorted manner including both
                parts.*/
            A[ start++ ] = Arr[ p ] ;
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
