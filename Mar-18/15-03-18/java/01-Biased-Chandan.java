import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();        
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=input.nextInt();
        for(int i=0;i<n;i++)
        {
            if(ar[i]==0)
            {
                int tmp=i;
                while(ar[tmp]==0)
                {
                    tmp--;
                    if(tmp<=0)
                        break;
                }
                ar[tmp]=0;
            }    
        }
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=ar[i];
        System.out.println(sum);
    }
}
