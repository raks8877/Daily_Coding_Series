
import java.io.*;

class 02-basic-of-implementation
{
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        int len=str.length();
        int cnt[]=new int[10];
        for(int i=0;i<len;i++)
        {
            cnt[ str.charAt(i)-'0' ]++;
        }
        
        for(int i=0;i<10;i++)
        {
            System.out.println( i+" "+cnt[i] );
                        
        }
    }
}
