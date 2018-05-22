
import java.io.*;

class TestClass {
    static int val(char ch)
    {
        if(ch == '0')
            return 0;
        else if(ch == '1')
            return 1;
        else if(ch == '2')
            return 2;
        else if(ch == '3')
            return 3;
        else if(ch == '4')
            return 4;
        else if(ch == '5')
            return 5;
        else if(ch == '6')
            return 6;
        else if(ch == '7')
            return 7;
        else if(ch == '8')
            return 8;
        else if(ch == '9')
            return 9;
        return 0;
        
    }
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            String str = input.readLine();
            int len = str.length();
            int n = val(str.charAt(len-1));
            if(n % 2 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
                
        }
    }
}
