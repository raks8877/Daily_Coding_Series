
import java.util.*;

class TestClass {
    static int N = (int)1e5;
    static int level[] = new int[N];
    static boolean visit[] = new boolean[N];
    static LinkedList<Integer> adj[] = new LinkedList[N];
    
    static int bfs(int s, int n)
    {
        LinkedList<Integer> q = new LinkedList<Integer>();
        q.add(s);
        visit[s] = true;
        level[s] = 0;
        
        while(q.size() != 0)
        {
            int v = q.poll();
            if(v == n)
                return level[v];
            
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
        return 0;
    }
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- >  0)
        {
            int n, e;
            n = input.nextInt();
            e = input.nextInt();
            for(int i = 0; i <= n; i++)
            {
                adj[i] = new LinkedList();
                visit[i] = false;
                level[i] = 0;
            }
            
            for(int i = 0; i < e; i++)
            {
                int x, y;
                x = input.nextInt();
                y = input.nextInt();
                adj[x].add(y);
                adj[y].add(x);    
            }
            
            System.out.println( bfs(1, n) );
        }
        
        
        
    }

}
