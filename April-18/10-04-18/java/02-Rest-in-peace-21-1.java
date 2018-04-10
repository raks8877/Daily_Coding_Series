
import java.util.*;

class TestClass {
    static String convert(int n)
    {
        String str = "";
        while(n > 0)
        {
            int d = n % 10;
            str = (char)('0' + d) + str;
            n /= 10;
        }
        return str;
    }
    
    static boolean check(int n)
    {
        String str = convert(n);
        int len = str.length();
        for(int i = 0; i < len; i++)
        {
            if(i + 1 < len)
            {
                if(str.charAt(i) == '2' && str.charAt(i+1) == '1')
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            int n = input.nextInt();
            if(n % 21 == 0)
                System.out.println("The streak is broken!");
            else
            {
                if(check(n))
                    System.out.println("The streak is broken!");
                else
                    System.out.println("The streak lives still in our heart!");
            }
        }
        
    }
}
