
import java.io.*;

class TestClass {
    static boolean pali(String str)
    {
        int n = str.length();
        for(int i = 0; i < n/2; i++)
        {
            if(str.charAt(i) != str.charAt(n-1-i))
                return false;
        }
        return true;
    }
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            String str = input.readLine();
            if(pali(str) == true)
                System.out.println("YES");
            else
                System.out.println("NO");
            
        }
    }
}
