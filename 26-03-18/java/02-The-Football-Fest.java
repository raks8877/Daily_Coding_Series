
import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        while(t-- > 0)
        {
            int n, id;
            String str[] = input.readLine().split(" ");
            n = Integer.parseInt(str[0]);
            id = Integer.parseInt(str[1]);
            Stack<Integer> st = new Stack<Integer>();
            st.push(id);
            int last = 0;
            while(n-- > 0)
            {
                String str1[] = input.readLine().split(" ");
                if(str1[0].equals("P") )
                {
                    
                    id = Integer.parseInt(str1[1]);
                    st.push(id);
                    last = 0;
                }
                else
                {
                    if(!st.empty())
                    {
                        if(last == 0)
                        {
                            last = st.peek();
                            st.pop();
                        }
                        else
                        {
                            int tmp = last;
                            last = st.peek();
                            st.pop();
                            st.push(tmp);
                        }
                    }
                }
            }
            System.out.println("Player " + st.peek() );
        }
        
    }
}
