
import java.io.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        int n = str.length();
        for(int i = n - 1; i >= 0; i--)
            System.out.print(str.charAt(i));
        
    }
}
