import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0)
        {
            int n = input.nextInt();
            HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
            for(int i=0;i<n;i++)
            {
                int tmp = input.nextInt();
                if(mp.containsKey(tmp))
                    mp.put(tmp,mp.get(tmp)+1);
                else
                    mp.put(tmp,1);
            }
            for(Map.Entry i:mp.entrySet())
            {
                if(mp.get(i.getKey())==1)
                {
                    System.out.println(i.getKey());
                    break;
                }
            }    
        }
        
    }
}
