
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();        
        int ar1[] = new int[n];
        int ar2[] = new int[n];
        
        for(int i = 0; i < n; i++)
            ar1[i] = input.nextInt();
        
        for(int i = 0; i < n; i++)
            ar2[i] = input.nextInt();
        
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        
        boolean flag = true;
        
        for(int i = 0; i < n; i++)
        {
            if(ar2[i] >= ar1[i])
            {
                flag = false;
                break;
            }
        }
        if(flag == true)
            System.out.println("Yes");
        else
            System.out.println("No");
            
    }
}
