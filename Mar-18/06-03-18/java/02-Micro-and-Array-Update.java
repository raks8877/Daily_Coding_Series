import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        
        int t;
        t=input.nextInt();
        while(t-->0)
        {
            int n,k,mini=1000001;
            n=input.nextInt();
            k=input.nextInt();
            int ar[]=new int[n];
            for(int i=0;i<n;i++)
            {
                ar[i]=input.nextInt();
                mini=Math.min(ar[i],mini);
                    
            }
            System.out.println(Math.max(0,k-mini));
            
        }
    }
}
