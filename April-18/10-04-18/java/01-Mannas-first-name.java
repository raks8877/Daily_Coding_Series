
import java.io.*;

class TestClass {
    static int count(String str, String word)
    {
        int n = str.length();
        int cnt = 0;
        boolean flag;
        int len = word.length();
        for(int i = 0; i < n; i++)
        {
            flag = true;
            for(int j = 0; j < len; j++)
            {
                if(i+j >= n)
                {
                    flag = false;
                    break;
                }
                if(str.charAt(i+j) != word.charAt(j))
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            String str = input.readLine();
            int cnt1 = count(str,"SUVOJIT");
            int cnt2 = count(str,"SUVO");
            System.out.println("SUVO = " + (cnt2-cnt1) + ", SUVOJIT = " + cnt1);
            
        }

    }
}
