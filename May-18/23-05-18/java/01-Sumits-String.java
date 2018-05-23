
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            String str = input.readLine();
            int n = str.length();
            int val = str.charAt(0) - 'a';
            boolean flag = true;
            for(int i = 1; i < n; i++)
            {
                int val2 = str.charAt(i) - 'a';
                int v = Math.abs(val2 - val );
                if(v != 1 && v != 25)
                {
                    flag = false;
                    break;
                    
                }
                val = val2;
            }
            if(flag == true)
                System.out.println("YES");
            else
                System.out.println("NO");
            
        }
    }
}
