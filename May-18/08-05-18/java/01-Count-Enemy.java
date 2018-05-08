
import java.io.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            String str = input.readLine();
            int n = str.length();
            char data[] = new char[n];
            for(int i = 0; i < n; i++)
            {
                data[i] = str.charAt(i);
            }
            
            boolean flag = false;
            int ans = 0;
            
            for(int i = 0; i < n; i++)
            {
                if(data[i] == 'X')
                    flag = true;
                if(data[i] == '*')
                    flag = false;
                if(flag && data[i] == 'O')
                    data[i] = '-';
            }
            flag = false;
            for(int i = n -1; i >= 0; i--)
            {
                if(data[i] == 'X')
                    flag = true;
                if(data[i] == '*')
                    flag = false;
                if(flag && data[i] == 'O')
                    data[i] = '-';
            }
            
            for(int i = 0; i < n; i++)
            {
                if(data[i] == 'O')
                    ans += 1;
            }
            System.out.println(ans);
        }
        
    }
}
