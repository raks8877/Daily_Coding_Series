
import java.io.*;


class TestClass {
    static void solu(String str[], int n, String cmpstr)
    {
        int len = cmpstr.length();
        int cnt = 0;
        boolean flag = false;
        for(int i = 0; i < len; i++)
        {
            flag = false;
            int l = str[cnt].length();
            for(int j = 0; j < l; j++)
            {
                if(str[cnt].charAt(j) == cmpstr.charAt(i))
                {
                    str[cnt] = str[cnt].substring(0,j) + '_' + str[cnt].substring(j+1); 
                    
                    flag = true;
                    break;
                }
            }
            if(flag)
            {
                cnt += 1;
                cnt %= n;
            }
            else
            {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        return;
    }
    
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            int n, m;
            String data = input.readLine();
            n = Integer.parseInt(data.split(" ")[0]);
            m = Integer.parseInt(data.split(" ")[1]);
            String str[] = new String[n];
            for(int i = 0; i < n; i++)
                str[i] = input.readLine();
            
            String cmpstr = input.readLine();
            
            solu(str, n, cmpstr);
        }
        
    }
}
