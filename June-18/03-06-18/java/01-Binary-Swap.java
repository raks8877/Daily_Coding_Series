
import java.io.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str1, str2;
        str1 = input.readLine();
        str2 = input.readLine();
        int n = str1.length(), cnt = 0;
        
        for(int i = 0; i < n; i++)
        {
            if(str1.charAt(i) != str2.charAt(i))
            {
                cnt += 1;
            }
        }
        
        if(cnt % 2 != 0)
            System.out.println("-1");
        else
            System.out.println(cnt/2);
        
        
    }
}
