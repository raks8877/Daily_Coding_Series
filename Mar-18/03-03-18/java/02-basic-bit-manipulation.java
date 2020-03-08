
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t=Integer.parseInt(input.readLine());
        while(t-->0)
        {
            int n;
            n=Integer.parseInt(input.readLine());
            int cnt=0;
            while(n>0)
            {
                if( (n&1) ==1)
                    cnt++;
                n>>=1;
            }
            System.out.println(cnt);
        }
        
    }
}
