
import java.io.*;

class 01-basic-of-input-output
{
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n;
        String str;
        n=Integer.parseInt(input.readLine());
        str=input.readLine();
        System.out.println( (n*2)  +"\n"+str);
        

    }
}
