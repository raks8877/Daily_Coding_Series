
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            String str = input.readLine();
            int n = str.length();
            for(int i = 0; i < n; i++)
            {
                int val = str.charAt(i) - 'a';
                if(val < 0 || val > 26)
                {
                    val = str.charAt(i) - 'A';
                }
                
                if(val < 0 || val > 26)
                {
                    val = -1;
                }
                
                if(val == -1)
                    System.out.print("$");
                else
                    System.out.print(val+1);
            }
            System.out.println();
        }
    }
}
