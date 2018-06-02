
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ar[] = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = input.nextInt();
        long a = 0, b = 0, c = 0;
        
        for(int i = 0; i < n; i += 3)
            a += ar[i];
        for(int i = 1; i < n; i += 3)
            b += ar[i];
        for(int i = 2; i < n; i += 3)
            c += ar[i];
        
        System.out.println(a + " " + b + " " + c);
        
    }
}
