
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        while(input.hasNext())
        {
            int n = input.nextInt();
            if(n == 42)
                break;
            else
                System.out.println(n);
        }
        
    }
}
