
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t,n;
        String str;
        t=Integer.parseInt(input.readLine());
        while(t-->0)
        {
            n=Integer.parseInt(input.readLine());
            int cnt=0;
            str=input.readLine();
            for(int i=0;i<n;i++)
            {
                if(str.charAt(i)=='0')
                    cnt++;
            }
            System.out.println(cnt);
        }
    }
}
