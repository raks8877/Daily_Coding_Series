
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            int n, k;
            String data = input.readLine();
            n = Integer.parseInt(data.split(" ")[0]);
            k = Integer.parseInt(data.split(" ")[1]);
            String str = input.readLine();
            
            for(int i = 0; i < n; i++)
            {
                int val1 = str.charAt(i) - 'a';
                int val2 = str.charAt(i) - 'A';
                int val3 = str.charAt(i) - '0';
                
                if(val1 >= 0 && val1 <= 26)
                {
                    val1 = (val1+k)%26;
                    System.out.print((char)('a'+val1));
                }
                else if(val2 >= 0 && val2 <= 26)
                {
                    val2 = (val2+k)%26;
                    System.out.print((char)('A'+val2));
                }
                else if(val3 >= 0 && val3 <= 10)
                {
                    val3 = (val3+k)%10;
                    System.out.print((char)('0'+val3));
                }
                else
                {
                    System.out.print(str.charAt(i));
                }
                
            }
            System.out.println();
        }
    }
}
