import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int ar[]=new int[n];
        int maxi[]=new int[n];
        
        for(int i=0;i<n;i++)
            ar[i]=input.nextInt();
        
        maxi[n-1]=ar[n-1];
        for(int i=n-2;i>=0;i--)
            maxi[i]=Math.max(maxi[i+1],ar[i]);
        
        for(int i=0;i<n;i++)
            if(ar[i]>=maxi[i])
                System.out.print(ar[i]+" ");
    }
}
