
import java.io.*;

class TestClass {
    static int getnum(char ch)
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
        else
            return 9;
    }
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine()), maxi = 0;
        while(t-- > 0)
        {
            String str = input.readLine();
            int n = str.length();
            boolean add = false, sub = false;
            int ans = 0;
            for(int i = 0; i < n; i++)
            {
                int val = str.charAt(i) - '0';
                if(val >= 0 && val <= 10)
                {
                    val = getnum(str.charAt(i));
                }
                else if(str.charAt(i) == '+')
                {
                    add = true;
                    sub = false;
                }
                else
                {
                    add = false;
                    sub = true;
                }
                
                if(i % 2 == 0)
                {
                    if(add == false && sub == false)
                        ans = val;
                    else if(add == true)
                        ans += val;
                    else if(sub == true)
                        ans -= val;
                }
            }
            if(ans > maxi)
            maxi = ans;
        }
        System.out.println(maxi);    
    }
    
}
