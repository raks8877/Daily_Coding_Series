import java.io.*;
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(input.readLine());
        int ar[] = new int[n];
        String str[] = new String[1001];
        
        for(int i=0;i<n;i++)
        {
            String data[] = input.readLine().split(" ");
            ar[i] =  Integer.parseInt(data[1]);
            str[ar[i]]=data[0];
        }
        
        Arrays.sort(ar);
        for(int i=n-1;i>n-4;i--)
        {
            System.out.println(str[ar[i]]);
        }
    }
}
