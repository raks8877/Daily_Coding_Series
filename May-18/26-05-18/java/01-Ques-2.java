
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n, x, y;
        n = input.nextInt();
        x = input.nextInt();
        y = input.nextInt();
        boolean flag = true;
        for(int i = 0; i < n; i++)
        {
            int val = input.nextInt();
            if(val < x || val > y)
                flag = false;
        }
        if(flag == true)
            System.out.println("YES");
        else
            System.out.println("NO");
        
        
    }
}
