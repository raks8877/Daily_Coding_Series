import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input=new Scanner(System.in);
        int n,x;
        n=input.nextInt();
        x=input.nextInt();
        int ar[]=new int[n];
        
        for(int i=0;i<n;i++)
            ar[i]=input.nextInt();
        
        int cnt=0;
        boolean skip=true;
        
        for(int i=0;i<n;i++)
        {
            if(ar[i]<=x)
                cnt++;
            else if(skip)
                skip=false;
            else
                break;
        }
        System.out.println(cnt);
    }
}
