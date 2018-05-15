
import java.io.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            String str = input.readLine();
            str = str + " ";
            StringBuffer ans = new StringBuffer();
            String nstr = "";
            
            int n = str.length();
            
            for(int i = 0; i < n; i++)
            {
                if(str.charAt(i) == ' ')
                {
                    nstr = nstr + " ";
                    ans.insert(0, nstr);
                    nstr = "";
                }
                else
                {
                    nstr += str.charAt(i);
                }
            }
            
            System.out.println(ans.toString());
        }
        
    }
}
