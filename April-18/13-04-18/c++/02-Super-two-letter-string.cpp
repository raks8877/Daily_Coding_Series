#include<bits/stdc++.h>

using namespace std;
typedef long ll;

const int MOD = 1e9+7;


int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n, p;
        cin >> n >> p;
        ll dp[n+1] = {0};
        dp[0] = 1;
        for(int i = 1; i <= n; i++)
        {
            int j = i - 1;
            while(j >= 0 && i-j <= p)
            {
                dp[i] += dp[j];
                dp[i] %= MOD;
                j--;
            }
        }
        cout << dp[n] << endl;
    }
    
}
