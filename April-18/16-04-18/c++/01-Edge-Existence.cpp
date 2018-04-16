#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n, m; 
    cin >> n >> m;
    int adj[n+2][m+2] = {0};
    for(int i = 0; i < m; i++)
    {
        int a, b;
        cin >> a >> b;
        adj[a+1][b+1] = 1;
        
    }
    int q;
    cin >> q;
    while(q--)
    {
        int a, b;
        cin >> a >> b;
        if(adj[a+1][b+1] )
            cout << "YES\n";
        else
            cout << "NO\n";
    }
}
