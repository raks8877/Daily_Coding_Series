
import java.util.*;

class TestClass {
    static boolean pali(int n)
    {
        int tmp = n;
        int num = 0;
        while(n != 0)
        {
            int d = n % 10;
            num = (num*10) + d;
            n /= 10;
        }
        if(num == tmp)
            return true;
        else
            return false;
    }
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            int a = input.nextInt();
            int b = input.nextInt();
            int cnt = 0;
            for(int i = a; i <= b; i++)
            {
                if(pali(i) == true)
                    cnt += 1;
            }
            System.out.println(cnt);
        }
    }
}
