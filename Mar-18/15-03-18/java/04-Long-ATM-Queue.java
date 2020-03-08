import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();        
        int ar[] = new int[n];
        for(int i=0;i<n;i++)
            ar[i] = input.nextInt();
        int ans = 1;
        for(int i=0;i<n-1;i++)
        {
            if(ar[i]>ar[i+1])
                ans+=1;
        }
        System.out.println(ans);
    }
}
