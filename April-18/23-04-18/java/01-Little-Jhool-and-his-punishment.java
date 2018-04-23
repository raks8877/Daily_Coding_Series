
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();        
        while(t-- > 0)
        {
            int n, b, g;
            n = input.nextInt();
            b = input.nextInt();
            g = input.nextInt();
            
            if(Math.max(b, g) - 1 > Math.min(b,g))
                System.out.println("Little Jhool wins!");
            else
                System.out.println("The teacher wins!");
        }
    }
}
