
import java.util.*;
import java.io.*;


class TestClass {
    static int v1, v2, cnt1, cnt2;
    static void solu(String str, int n)
    {
        v1 = v2 = cnt1 = cnt2 = 0;
        for(int i = 0; i < n; i++)
        {
            v1 = str.charAt(i) - 'a';
            v2 = str.charAt(i) - 'A';
            if(v1 >= 0 && v1 <= 25)
                cnt1++;
            else if(v2 >= 0 && v2 <= 25)
                cnt2++;
        }
        if(( cnt1 == 0 && cnt2 == 0) || (n < 1 || n > 100))
        {
            System.out.println("Invalid Input");
            return;
        }
        System.out.println(Math.min(cnt1, cnt2));
        return;
    }
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String data = input.readLine();
        int t = 0;
        try
        {    t = Integer.parseInt(data);
        }
        catch(Exception e)
        {
            t = -1;
        }
        if(t < 1 || t > 10)
            System.out.println("Invalid Test");
        else
        {
            while(t-- > 0)
            {
                String str = input.readLine();
                int n = str.length();
                solu(str, n);
            }
        }
        
    }
}
