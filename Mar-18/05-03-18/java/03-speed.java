import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t;
        t=input.nextInt();
        while(t-->0)
        {
            int n;
            n=input.nextInt();
            int ar[]=new int[n];
            for(int i=0;i<n;i++)
                ar[i]=input.nextInt();
            int cnt=1,mini=ar[0];
            for(int i=1;i<n;i++)
            {
                if(ar[i]<=ar[i-1] && ar[i]<=mini)
                    cnt++;
                if(ar[i]<mini)
                    mini=ar[i];
            }
            System.out.println(cnt);
        }
    }
}
