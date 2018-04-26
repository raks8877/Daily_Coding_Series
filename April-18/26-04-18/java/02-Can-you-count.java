
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            String str = input.readLine();
            int n = str.length();
            int cnt = 0, cnta, cnte, cnti, cnto, cntu;
            cnta = cnte = cnti = cnto = cntu = 0;
            
            long ans = 1;
            for(int i = 0; i < n; i++)
            {
                if(str.charAt(i) == '_')
                {
                    if(cnt != 0)
                        ans *= cnt;
                }
                if(str.charAt(i) == 'a')
                    cnta = 1;
                if(str.charAt(i) == 'e')
                    cnte = 1;
                if(str.charAt(i) == 'i')
                    cnti = 1;
                if(str.charAt(i) == 'o')
                    cnto = 1;
                if(str.charAt(i) == 'u')
                    cntu = 1;
                
                cnt = cnta + cnte + cnti + cnto + cntu;
            }
            System.out.println(ans);
        }
        
    }
}
