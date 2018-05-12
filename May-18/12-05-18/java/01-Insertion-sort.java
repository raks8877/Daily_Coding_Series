
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ar[] = new int[n];
        int pos[] = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            ar[i] = input.nextInt();
            pos[i] = ar[i];
        }
        
        Arrays.sort(ar);
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(pos[i] == ar[j])
                {
                    System.out.print( (j+1) + " ");
                }
            }
        }
    }
}
