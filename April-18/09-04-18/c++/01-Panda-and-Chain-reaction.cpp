#include<bits/stdc++.h>

using namespace std;

const int MOD = 1e6+3;
long dp[MOD + 1];

void solve()
{
    dp[0] = 1;
    for(int  i = 1; i < MOD; i++)
    {
        dp[i] = (dp[i-1] * i) % MOD;
    }
}

int main()
{
    solve();
    int t;
    cin >> t;
    while(t--)
    {
        long n, x;
        cin >> n >> x;
        if(n >= MOD)
            cout << "0" << endl;
        else
        {
            long ans = (dp[n] * (x%MOD) ) % MOD;
            cout << ans << endl;
        }
    }
}
