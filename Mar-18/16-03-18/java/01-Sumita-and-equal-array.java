
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0)
        {
            int n,x,y,z;
            n = input.nextInt();
            x = input.nextInt();
            y = input.nextInt();
            z = input.nextInt();
            int ar[] = new int[n];
            for(int i=0;i<n;i++)
            {
                ar[i] = input.nextInt();
                while(ar[i]%x==0)
                    ar[i] /= x;
                while(ar[i]%y==0)
                    ar[i] /= y;
                while(ar[i]%z==0)
                    ar[i] /= z;
            }
            boolean flag = false;
            for(int i=1;i<n;i++)
            {
                if(ar[i]!=ar[0])
                {
                    flag=true;
                    break;
                }
            }
            if(flag)
                System.out.println("She can't");
            else
                System.out.println("She can");
            
        }
    }
}
