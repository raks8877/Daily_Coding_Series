
import java.util.*;
import java.io.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int ar[] = new int[n];
        String data[] = input.readLine().split(" ");
        for(int i = 0; i < n; i++)
        {
            ar[i] = Integer.parseInt(data[i]);
        }
        
        int q, x;
        String val[] = input.readLine().split(" ");
        
        q = Integer.parseInt(val[0]);
        x = Integer.parseInt(val[1]);
        int sum = 0, i = 0, cnt = 0;
        boolean flag = false;
        Stack<Integer> st = new Stack<Integer>();
        while(q-- > 0)
        {
            String str = input.readLine();
            if(str.equals("Harry"))
            {
                sum += ar[i];
                st.push(ar[i]);
                i++;
                cnt++;
            }
            else if(str.equals("Remove"))
            {
                sum -= st.peek();
                st.pop();
                cnt--;
            }
            if(sum == x)
            {
                flag = true;
                q = 0;
                break;
            }
        }
        if(flag)
            System.out.println(cnt);
        else
            System.out.println("-1");
        
    }
}
