import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        Stack<Integer> st=new Stack<Integer>();
        int q=input.nextInt();
        while(q-->0)
        {
            int t=input.nextInt();
            if(t==1)
            {
                if(!st.empty())
                    System.out.println(st.pop());
                else
                    System.out.println("No Food");
            }
            else
            {
                int c=input.nextInt();
                st.push(c);
            }
            
        }
        
    }
}
