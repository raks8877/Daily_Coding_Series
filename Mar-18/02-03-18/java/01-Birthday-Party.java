import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner input = new Scanner(System.in);
        
        int t,n,m;
        t=input.nextInt();
        while(t-->0)
        {
            n=input.nextInt();
            m=input.nextInt();
            
            if(m%n==0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        
    }
}
