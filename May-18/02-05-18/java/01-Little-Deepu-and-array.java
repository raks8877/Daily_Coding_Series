
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();        
        int ar[] = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = input.nextInt();
        
        int q = input.nextInt();
        while(q-- > 0)
        {
            int x = input.nextInt();
            for(int i = 0; i < n; i++)
            {
                if(ar[i] > x)
                {
                    ar[i] -= 1;
                }
            }
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(ar[i] + " ");
        }
        
    }
}
