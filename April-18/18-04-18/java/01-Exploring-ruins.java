
import java.io.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        int n = str.length();
        
        for(int i = 0; i < n; i++)
        {
            if(i+1 < n)
            {
                if(str.charAt(i) == '?' )
                {
                    if(str.charAt(i+1) == 'a' || ( i-1 >= 0 && str.charAt(i-1) == 'a'))
                        str = str.substring(0,i) + 'b' + str.substring(i+1);
                    else
                        str = str.substring(0,i) + 'a' + str.substring(i+1);
                }
            }
            if(i == n-1)
            {
                if(str.charAt(i) == '?')
                {
                    if(i-1 >= 0 && str.charAt(i-1) == 'a')
                        str = str.substring(0,i) + 'b' ;
                    else
                        str = str.substring(0,i) + 'a';
                        
                }
            }
        }
        System.out.println(str);
        
    }
}
