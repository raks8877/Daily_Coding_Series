
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ar[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            ar[i] = input.nextInt();
        }
        int k = input.nextInt(), pos = -1;
        for(int i = 0; i < n; i++)
        {
            if(ar[i] == k)
            {
                pos = i;
                break;
            }
        }
        System.out.println(pos);
        
    }
}
