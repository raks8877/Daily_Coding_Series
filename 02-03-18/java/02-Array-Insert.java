
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n,q;
        n=input.nextInt();
        q=input.nextInt();
        
        int ar[]=new int[n];
        
        for(int i=0;i<n;i++)
            ar[i]=input.nextInt();
        
        for(int i=0;i<q;i++)
        {
            int a,b,c;
            a=input.nextInt();
            b=input.nextInt();
            c=input.nextInt();
            
            if(a==1)
            {
                ar[b]=c;
            }
            else
            {
                int sum=0;
                for(int j=b;j<=c;j++)
                    sum+=ar[j];
                System.out.println(sum);
            }
        }
    }
}
