import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n=Integer.parseInt(input.readLine());
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=Integer.parseInt(input.readLine());
        for(int i=n-1;i>=0;i--)
            System.out.println(ar[i]);
    }
}
