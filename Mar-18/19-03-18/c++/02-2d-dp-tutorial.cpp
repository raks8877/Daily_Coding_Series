#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n, m;
    cin >> n >> m;
    int ar[n][m];
    int dp[n][m] = {0};
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < m; j++)
        {
            cin >> ar[i][j];
        }
    }
    
    dp[0][0] = ar[0][0];
    for(int i = 1; i < n; i++)
    {
        dp[i][0] = ar[i][0] + dp[i-1][0];
    }
    
    for(int j = 1; j < m; j++)
    {
        dp[0][j] = ar[0][j] + dp[0][j-1];
    }
    
    for(int i = 1; i < n; i++)
    {
        for(int j = 1; j < m; j++)
        {
            dp[i][j] = dp[i][j-1] + dp[i-1][j] + ar[i][j] - dp[i-1][j-1] ;
            
        }
    }
    
    int q;
    cin >> q;
    while(q--)
    {
        int x, y;
        cin >> x >> y;
        x--;
        y--;
        cout << dp[x][y] <<endl;
    }
    
}
