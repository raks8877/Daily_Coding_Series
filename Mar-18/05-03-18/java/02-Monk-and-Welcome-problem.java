import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n;
        n=input.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=input.nextInt();
        for(int i=0;i<n;i++)
            b[i]=input.nextInt();
        for(int i=0;i<n;i++)
            System.out.print( (a[i]+b[i])+" ");
        
    }
}
