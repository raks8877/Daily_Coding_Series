#include<bits/stdc++.h>

using namespace std;

const int N = 1e5 + 5;
bool visit[N];
vector<int> adj[N];
int level[N];

int bfs(int s, int n)
{
    queue<int> q;
    q.push(s);
    visit[s] = true;
    level[s] = 0;
    
    while(!q.empty())
    {
        int v = q.front();
        q.pop();
        if(v == n)
            return level[v];
        
        for(int i = 0; i < adj[v].size(); i++)
        {
            int val = adj[v][i];
            if(!visit[val])
            {
                visit[val] = true;
                level[val] = level[v] + 1;
                q.push(val);
                
            }
        }
    }
    return 0;
}


int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        memset(visit,false,sizeof(visit));
        memset(adj,0,sizeof(adj));
        memset(level,0,sizeof(level));
        int n, e;
        cin >> n >> e;
        for(int i = 0;  i < e; i++)
        {
            int x, y;
            cin >> x >> y;
            adj[x].push_back(y);
            adj[y].push_back(x);
        }
        cout << bfs(1, n) << endl;
    }
}
