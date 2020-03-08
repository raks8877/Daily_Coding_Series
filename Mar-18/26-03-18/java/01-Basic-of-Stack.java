
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        
        Stack<Integer> st = new Stack<Integer>();
        
        while(q-- > 0)
        {
            int x, y;
            x = input.nextInt();
            if(x == 1)
            {
                if(st.empty())
                    System.out.println("No Food");
                else
                {
                    System.out.println(st.peek());
                    st.pop();
                }
            }
            else
            {
                y = input.nextInt();
                st.push(y);
            }
        }

    }
}
