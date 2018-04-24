
import java.io.*;

class TestClass {
    
    static boolean check(String str)
    {
        int n = str.length();
        boolean a,e,i,o,u;
        a = e = i = o = u = false;
        for(int x = 0; x < n; x++)
        {
            if(str.charAt(x) == 'a')
                a = true;
            if(str.charAt(x) == 'e')
                e = true;
            if(str.charAt(x) == 'i')
                i = true;
            if(str.charAt(x) == 'o')
                o = true;
            if(str.charAt(x) == 'u')
                u = true;
        }
        if(a && e && i && o && u)
            return true;
        else
            return false;
    }
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            String str = input.readLine();
            if(check(str) == true)
                System.out.println("YES");
            else
                System.out.println("NO");
            
        }
    }
}
