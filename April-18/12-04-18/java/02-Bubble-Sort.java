
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ar[] = new int[n];
        for(int i = 0 ; i < n; i++)
            ar[i] = input.nextInt();
        int cnt = 0;
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = 0; j < n - i - 1; j++)
            {
                if(ar[j] > ar[j+1])
                {
                    int tmp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = tmp;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
