
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n, k;
        n = input.nextInt();
        k = input.nextInt();
        
        int ar[] = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = input.nextInt();
            
        for(int i = 0; i < k; i++)
        {
            int pos = i;
            for(int j = i + 1; j < n; j++)
            {
                if(ar[j] < ar[pos])
                {
                    pos = j;
                }
            }
            int tmp = ar[i];
            ar[i] = ar[pos];
            ar[pos] = tmp;
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(ar[i] + " ");
        }
    }
}

