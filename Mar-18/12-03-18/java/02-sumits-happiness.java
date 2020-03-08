import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0)
        {
            int n=input.nextInt();
            long ar[]=new long[n];
            long psum=0,nsum=0,ans=0;
            int cnt=0;
            for(int i=0;i<n;i++)
            {
                ar[i]=input.nextInt();
                if(ar[i]<=0)
                    nsum+=ar[i];
            }
            Arrays.sort(ar);
            
            for(int i=n-1;i>=0;i--)
            {
                if(ar[i]>=0)
                {
                    psum+=ar[i];cnt++;
                }
                else
                    break;
            }
            ans=(psum*cnt)+nsum;
            
            for(int i=n-1-cnt;i>=0;i--)
            {
                psum+=ar[i];
                nsum-=ar[i];
                cnt++;
                long temp=(psum*cnt)+nsum;
                ans=Math.max(ans,temp);
            }
            System.out.println(ans);
        }
    }
}
