import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n;
        n=input.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=input.nextInt();
        }
        Arrays.sort(ar);
        
        int cnt=0;
        for(int i=ar[0];i<=ar[n-1];i++)
        {
            while(ar[cnt]==i)
            {
                cnt++;
                if(cnt>=n)
                    break;
            }
            
            if(ar[cnt-1]!=i)
            {
                System.out.println("NO");
                System.exit(0);
                
            }
            
        }
        System.out.println("YES");
        
    }
}
