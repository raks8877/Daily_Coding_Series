#include<bits/stdc++.h>

using namespace std;
const int MAXN = 1e5 + 1;
int n;
vector<int> adj[MAXN];
bool visit[MAXN];


void dfs(int s)
{
    stack<int> st;
    st.push(s);
    visit[s] = true;
    
    while(!st.empty())
    {
        int v = st.top();
        st.pop();
        
        for(int i = 0; i < adj[v].size(); i++)
        {
            int val = adj[v][i];
            if(visit[val] == false)
            {
                st.push(val);
                visit[val] = true;
            }
        }
    }
}

int main()
{
    int e;
    cin >> n >> e;
    
    for(int i = 1; i <= e; i++)
    {
        int x, y;
        cin >> x >> y;
        adj[x].push_back(y);
        adj[y].push_back(x);
    }
    int start;
    cin >> start;
    dfs(start);
    int cnt = 0;
    for(int i = 1; i <= n; i++)
    {
        if(!visit[i])
            cnt += 1;
    }
    cout << cnt << endl;
}
