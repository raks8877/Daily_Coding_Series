
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long sum = 0, val = 0;
        for(int i = 0 ; i < n; i++)
        {
            val = input.nextLong();
            sum += val;
        }
        System.out.println(sum);
    }
}
