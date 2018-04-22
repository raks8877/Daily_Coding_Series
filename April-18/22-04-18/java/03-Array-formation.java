
import java.io.*;

import java.util.*;


public class TestClass {
    static int N = 1000001;
    static boolean check[] = new boolean[N];
    
    static void checkFunc()
    {
        check[0] = check[1] = true;
        for(int i = 2; i < N; i++)
        {
            if(check[i] == false)
            {
                for(int j = 2*i; j < N; j += i)
                {
                    check[j] = true;
                }
            }
        }
    }
    static int[][] queue_and_stack(int[] A){
        checkFunc();
        int n = A.length;
        int ar1[] = new int[n];
        int ar2[] = new int[n];
        int cnt1 = 0, cnt2 = 0;
        for(int i = 0; i < n; i++)
        {
            if(check[A[i]] == false)
            {
                ar1[cnt1++] = A[i];
            }
            else
            {
                ar2[cnt2++] = A[i];
            }
        }
        
        int ar[][] = new int[2][];
        ar[0] = new int[cnt1];
        ar[1] = new int[cnt2];
        
        
        for(int i = 0; i < cnt1; i++)
        {
            ar[0][i] = ar1[i];
        }
        
        for(int i = cnt2 -1; i >= 0; i--)
        {
            ar[1][cnt2-i-1] = ar2[i];
        }
        
        return ar;
    
    }
    public static void main(String[] args) throws IOException {
        Reader input = new Reader();
        PrintWriter wr = new PrintWriter(System.out);
       
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter wr = new PrintWriter(System.out);
         //int n = Integer.parseInt(br.readLine().trim());
         int n = input.nextInt();
         //String[] arr_A = br.readLine().split(" ");
         
         int[] A = new int[n];
         for(int i_A=0; i_A< n; i_A++)
         {
         	//A[i_A] = Integer.parseInt(arr_A[i_A]);
            A[i_A] = input.nextInt();
             
         }

         int[][] out_ = queue_and_stack(A);
         for(int i_out_=0; i_out_<out_.length; i_out_++)
         {
         	wr.print(out_[i_out_][0]);
         	for(int j_out_=1; j_out_<out_[i_out_].length; j_out_++)
         	{
         		wr.print(" " + out_[i_out_][j_out_]);
         	}
         	wr.println("");
         }
         wr.flush();
         
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





