
import java.io.*;


class TestClass {
    
    static int check(char ch)
    {
        if(ch == '0')
            return 6;
        else if(ch == '1')
            return 2;
        else if(ch == '2')
            return 5;
        else if(ch == '3')
            return 5;
        else if(ch == '4')
            return 4;
        else if(ch == '5')
            return 5;
        else if(ch == '6')
            return 6;
        else if(ch == '7')
            return 3;
        else if(ch == '8')
            return 7;
        else if(ch == '9')
            return 6;
        return 0;   
    }

    
    static int solu(String str)
    {
        int ans = 0;
        int n = str.length();
        
        for(int i = 0; i < n; i++)
        {
            ans += check(str.charAt(i));
        }
        return ans;
    }
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(input.readLine());
            String ans = "";
            int mini = (int)1e9 + 7;
            String str = input.readLine();
            String data[] = str.split(" ");
            for(int i = 0; i < n; i++)
            {
                int val = solu(data[i]);
                if(val < mini)
                {
                    mini = val;
                    ans = data[i];
                }
            }
            
            System.out.println(ans);
        }
    }
}
