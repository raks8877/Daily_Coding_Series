
import java.io.*;


class TestClass {
    static boolean check(String str)
    {
        int n = str.length();
        int cnt1,cnt0;
        cnt1 = cnt0 = 0;
        
        for(int i = 0; i < n; i++)
        {
            if(str.charAt(i) == '0')
            {
                cnt0 += 1;
                cnt1 = 0;
            }
            else
            {
                cnt1 += 1;
                cnt0 = 0;
            }
            if(cnt1 == 6 || cnt0 == 6)
            {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        if(!check(str))
            System.out.println("Good luck!");
        else
            System.out.println("Sorry, sorry!");
        
    }
}
