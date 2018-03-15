import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int diff = input.nextInt();
        
        for(int i=1;i<n;i++)
        {
            int tmp = input.nextInt();
            diff = tmp-diff;
            if(diff<0)
                break;
        }
        if(diff==0)
            System.out.println("YES");
        else
            System.out.println("NO");
        
        
    }
}
