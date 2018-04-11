
import java.util.*;

class TestClass {
    static Vector vec = new Vector();
    static void seive()
    {
        int check[] = new int[1001];
        for(int i = 2; i <= 1000; i++)
        {
            if(check[i] == 0)
            {
                vec.add(i);
                for(int j = 2*i; j <= 1000; j += i)
                {
                    check[j] = 1;
                }
            }
        }
    }
    public static void main(String args[] ) throws Exception {
        seive();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Enumeration vEnum = vec.elements();
        int tmp = n;
        while(vEnum.hasMoreElements())
        {   
            int pri = (int)vEnum.nextElement();
            if(pri > n)
            {
                break;
            }
            System.out.print(pri + " ");
            
        }
    }
}
