
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            String str, nstr = "";
            str = input.readLine();
            int n = str.length();
            
            for(int i = 0; i < n; i++)
            {
                nstr += str.charAt(i);
                while(i < n-1 && str.charAt(i) == str.charAt(i+1))
                {
                    i++;
                    
                }
            }
            System.out.println(nstr);
        }
        
    }
}
