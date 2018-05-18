
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(input.readLine());
            String str = input.readLine();
            int cnt = 0;
            boolean flag = false;
            for(int i = 0; i < n; i++)
            {
                int val = str.charAt(i) - '0';
                if(val >=0 && val <= 10)
                {
                    if(flag == false)
                    {
                        cnt += 1;
                        flag = true;
                    }
                    
                }
                else
                {
                    flag = false;
                }
            }
            System.out.println(cnt);
        }
    }
}
