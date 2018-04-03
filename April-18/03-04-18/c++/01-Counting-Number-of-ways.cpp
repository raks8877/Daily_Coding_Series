#include<bits/stdc++.h>

using namespace std;
typedef long long ll;
const int MOD = 1e9+7;
ll dp[10002][102] ;

void precompute()
{
    for(int i = 1; i <= 100; i++)
        dp[0][i] = 1;
    
    for(int k = 1; k <= 100; k++)
    {
        for(int i = 1; i <= 10000; i++)
        {
            for(int j = 1; j <= min(i,k); j++)
            {
                dp[i][k] = ( (dp[i][k]%MOD) + (dp[i-j][k]%MOD) ) %MOD;
            }
        }
    }
}

int  main()
{
    precompute();
    int t;
    cin >> t;
    while(t--)
    {
        int x, k ;
        cin >> x >> k;
        cout << dp[x][k] << endl;
    }
}
