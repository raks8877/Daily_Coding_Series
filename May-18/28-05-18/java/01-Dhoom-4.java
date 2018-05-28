
import java.util.*;


class TestClass {
    static int N = (int)1e5 + 5;
    static int visit[] = new int[N];
    
    static void solu(long ar[], long n, long k, long l)
    {
        for(int i = 0; i < N; i++)
            visit[i] = -1;
        
        LinkedList<Long> q = new LinkedList<Long>();
        q.add(k);
        visit[(int)k] = 0;
        
        while(q.size() != 0)
        {
            long val = q.poll();
            
            for(int i = 0; i < n; i++)
            {
                long data = (val * ar[i]) % 100000;
                if(visit[(int)data] == -1)
                {
                    visit[(int)data] = 1 + visit[(int)val];
                    q.add(data);
                }
            }
        }
        System.out.println(visit[(int)l]);
        
    }
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        long k, l;
        k = input.nextLong();
        l = input.nextLong();
        long n = input.nextLong();
        long ar[] = new long[(int)n];
        for(int i = 0; i < n; i++)
            ar[i] = input.nextLong();
        solu(ar, n, k, l);
    }
}
