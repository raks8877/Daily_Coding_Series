
import java.io.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            String str = input.readLine();
            int n = str.length();
            for(int i = n-1; i >= 0; i--)
            {
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }
        
    }
}
