
import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        HashMap<Integer,String> mp = new HashMap<Integer,String>();
        
        for(int i = 0; i < n; i++)
        {
            int a;String str,tmp;
            tmp = input.readLine();
            a = Integer.parseInt(tmp.split(" ")[0]);
            str = tmp.split(" ")[1];
            mp.put(a,str);
        }
        int q = Integer.parseInt(input.readLine());
        while(q-- > 0)
        {
            int x = Integer.parseInt(input.readLine());
            System.out.println(mp.get(x));
        }
        

    }
}
