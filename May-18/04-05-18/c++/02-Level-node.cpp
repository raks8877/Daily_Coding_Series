#include<bits/stdc++.h>

using namespace std;
const int N = 1e5+5;
vector<int> adj[N];
bool visit[N];
int level[N];

void bfs(int s)
{
    queue<int> q;
    q.push(s);
    visit[s] = true;
    level[s] = 1;
    while(!q.empty())
    {
        int v = q.front();
        q.pop();
        
        for(int i = 0; i < adj[v].size(); i++)
        {
            int val = adj[v][i];
            if(!visit[val])
            {
                level[val] = level[v] + 1;
                visit[val] = true;
                q.push(val);
            }
        }
    }
}

int main()
{
    int n;
    cin >> n;
    
    for(int i = 1; i < n; i++)
    {
        int x, y;
        cin >> x >> y;
        adj[x].push_back(y);
        adj[y].push_back(x);
        
    }
    int l;
    cin >> l;
    
    bfs(1);
    int cnt = 0;
    for(int i = 1; i < n; i++)
    {
        if(level[i] == l)
        {
            cnt += 1;
        }
    }
    cout << cnt << endl;
    
}
