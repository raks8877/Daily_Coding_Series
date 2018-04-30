
import java.io.*;

class TestClass {
    static boolean check(String str1, String str2)
    {
        int n1 = str1.length();
        int n2 = str2.length();
        int hash1[] = new int[27];
        int hash2[] = new int[27];
        
        for(int i = 0; i < n1; i++)
        {
            int val = str1.charAt(i) - 'a';
            hash1[val] += 1;
        }
        for(int i = 0; i < n2; i++)
        {
            int val = str2.charAt(i) - 'a';
            hash2[val] += 1;
        }
        
        for(int i = 0; i < 27; i++)
        {
            if(hash1[i] != hash2[i])
            {
                return false;
            }
        }
        return true;
        
    }
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            String data = input.readLine();
            String str1, str2;
            str1 = data.split(" ")[0];
            str2 = data.split(" ")[1];
            if(check(str1, str2) == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        
    }
}
