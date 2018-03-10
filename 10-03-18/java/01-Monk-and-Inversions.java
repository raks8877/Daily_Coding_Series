import java.util.*;


class TestClass {
    
    int check(int ar[][],int n,int l,int r)
    {
        int cnt=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(l<=i && r<=j)
                    if(ar[l][r]>ar[i][j])    
                        cnt++;
        return cnt;
    }
    public static void main(String args[] ) throws Exception {
        Scanner input=new Scanner(System.in);
        TestClass obj=new TestClass();
        int t;
        t=input.nextInt();
        while(t-->0)
        {
            int n;
            n=input.nextInt();
            int ar[][]=new int[n][n];
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    ar[i][j]=input.nextInt();
            
            int ans=0;
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    ans+=obj.check(ar,n,i,j);
            System.out.println(ans);
        }
    
    }
}
