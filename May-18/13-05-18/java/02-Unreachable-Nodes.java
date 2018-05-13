
import java.util.*;

class TestClass {
    static int N = (int)1e5;
    static boolean visit[] = new boolean[N];
    static LinkedList<Integer> adj[] = new LinkedList[N];
    
    static void dfs(int s)
    {
        Stack<Integer> st = new Stack<Integer>();
        st.push(s);
        visit[s] = true;
        
        while(st.empty() == false)
        {
            int v = st.pop();
            
            
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext())
            {
                int val = i.next();
                if (visit[val] == false)
                {
                    visit[val] = true;
                    st.push(val);
                }
            }
        }
    }
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int n, e;
        n = input.nextInt();
        e = input.nextInt();
        
        for(int i = 0; i <= n; i++)
            adj[i] = new LinkedList();
        for(int i = 0; i < e; i++)
        {
            int x, y;
            x = input.nextInt();
            y = input.nextInt();
            adj[x].add(y);
            adj[y].add(x);
        }
        int start = input.nextInt();
        dfs(start);
        
        int cnt = 0;
        for(int i = 1; i <= n; i++)
        {
            if(visit[i] == false)
                cnt += 1;
        }
        System.out.println(cnt);
        
    }
}
