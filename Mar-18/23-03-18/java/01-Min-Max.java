import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ar[] = new int[n];
        int sum = 0, mini = Integer.MAX_VALUE, maxi = 0;
        
        for(int i = 0; i < n; i++)
        {
            ar[i] = input.nextInt();
            sum += ar[i];
            if(ar[i] > maxi)
                maxi = ar[i];
            if(ar[i] < mini)
                mini = ar[i];
        }
        
        System.out.println( (sum-maxi) + " " + (sum-mini) );
        
    }
}
