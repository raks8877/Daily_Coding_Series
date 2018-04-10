
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ar[] = new int[n+1];
        ar[0] = 0;
        for(int i = 1; i <= n; i++)
        {
            ar[i] = input.nextInt();
            if(ar[i] % 2 == 0)
                ar[i] = 1;
            else
                ar[i] = -1;
        }
        
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        
        mp.put(0 , 1);
        long ans = 0;
        for(int i = 1; i <= n; i++)
        {
            ar[i] += ar[i-1];
            int val = 0;
            if(mp.containsKey(ar[i]))
                val = mp.get(ar[i]);
            
            ans += val;
            mp.put(ar[i] , (val+1));
        }
        System.out.println(ans);
    
        
    }
}
