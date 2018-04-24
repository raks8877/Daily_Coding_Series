
import java.io.*;


class TestClass {
    static boolean pali(String str1, String str2)
    {
        int l1 = str1.length();
        int l2 = str1.length();
        if(l1 != l2)
            return false;
            
        for(int i = 0; i < l1; i++)
        {
            if(str1.charAt(i) != str2.charAt(l2-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        String str[] = new String[n];
        for(int i = 0; i < n; i++)
        {
            str[i] = input.readLine();
        }
        
        int len = 0;
        char ch = ' ';
        
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(pali(str[i],str[j]))
                {
                    len = str[i].length();
                    ch = str[i].charAt(len/2);
                    break;
                }
            }
        }
        System.out.println(len + " " + ch);
    }
}
