
import java.util.*;

class TestClass {
    static int N = 100005;
    static int starting[] = new int[N] ;
    static int ending[] = new int[N];
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ar[] = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            ar[i] = input.nextInt();
            if(starting[ ar[i] ] == 0)
            {
                starting[ ar[i] ] = i;
            }
            else
            {
                ending[ ar[i] ] = i;
            }
        }
        int maxi = 0;
        for(int i = 0; i < n; i++)
        {
            int tmp = ending[ ar[i] ] - starting[ ar[i] ] + 1;
            if(tmp > maxi)
                maxi = tmp;
        }
        System.out.println(maxi);
        
    }
}
