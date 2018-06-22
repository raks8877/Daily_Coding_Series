
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            String str1, str2;
            str1 = input.readLine();
            str2 = input.readLine();
            int n1 = str1.length();
            int n2 = str2.length();
            int ar1[] = new int[27];
            int ar2[] = new int[27];
            
            for(int i = 0; i < n1; i++)
            {
                int v = str1.charAt(i) - 'a';
                ar1[v] += 1;
            }
            for(int i = 0; i < n2; i++)
            {
                int v = str2.charAt(i) - 'a';
                ar2[v] += 1;
            }
            
            int val = 0;
            
            for(int i = 0; i < 26; i++)
            {
                if(ar1[i] != 0 && ar2[i] != 0)
                {
                    val += 2*Math.min(ar1[i], ar2[i]);
                }
            }
            
            int ans = n1 + n2 - val;
            System.out.println(ans);
            
            
        }
    }
}
