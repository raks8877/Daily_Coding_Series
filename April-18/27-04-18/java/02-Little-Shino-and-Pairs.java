
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ar[] = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = input.nextInt();
        Stack<Integer> st = new Stack<Integer>();
        st.push(ar[0]);
        int ans = 0;
        for(int i = 1; i < n; i++)
        {
            while(!st.empty() && ar[i] > st.peek())
            {
                st.pop();
                ans++;
            }
            if(!st.empty())
                ans++;
            st.push(ar[i]);
        }
        System.out.println(ans);
        
        
    }
}
