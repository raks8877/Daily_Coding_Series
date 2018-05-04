
import java.util.*;

class TestClass {
    static int N = (int)1e5;
    static int level[] = new int[N];
    static boolean visit[] = new boolean[N];
    static LinkedList<Integer> adj[] = new LinkedList[N];
    
    static void bfs(int s)
    {
        LinkedList<Integer> q = new LinkedList<Integer>();
        q.add(s);
        visit[s] = true;
        level[s] = 1;
        
        while(q.size() != 0)
        {
            int v = q.poll();
            
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext())
            {
                int val = i.next();
                if (visit[val] == false)
                {
                    visit[val] = true;
                    q.add(val);
                    level[val] = level[v] + 1;
                }
            }
        }
    }
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        for(int i = 0; i <= n; i++)
            adj[i] = new LinkedList();
        for(int i = 1; i < n; i++)
        {
            int x, y;
            x = input.nextInt();
            y = input.nextInt();
            adj[x].add(y);
            adj[y].add(x);
        }
        bfs(1);
        int l = input.nextInt();
        int cnt = 0;
        for(int i = 1; i < n; i++)
        {
            if(level[i] == l)
                cnt += 1;
        }
        System.out.println(cnt);
        
    }
}
