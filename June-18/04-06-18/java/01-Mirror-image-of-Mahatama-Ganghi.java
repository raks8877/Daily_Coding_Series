
import java.io.*;


class TestClass {
    static boolean pali(String str, int n)
    {
        for(int i = 0; i < n/2; i++)
        {
            if(str.charAt(i) != str.charAt(n-i-1))
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
            int n = str.length();
            boolean flag = false;
            for(int i = 0; i < n; i++)
            {
                char ch = str.charAt(i);
                if(ch == '0' || ch == '1' || ch == '8')
                    continue;
                else
                {
                    flag = true;
                    break;
                }
            }
            if(flag == false && pali(str, n) == true)
                System.out.println("YES");
            else
                System.out.println("NO");
            
            
        }
        
    }
}
