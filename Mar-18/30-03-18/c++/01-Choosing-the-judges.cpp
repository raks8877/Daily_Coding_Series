#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin >> t;
    for(int x = 1; x <= t; x++)
    {
        int n;
        cin >> n;
        int ar[n+1] = {0};
        for(int i = 1; i <= n; i++)
        {
            cin >> ar[i];
        }
        long dp[n+1] = {0};
        dp[1] = ar[1];
        long maxi = dp[1];
        for(int i = 2; i <= n; i++)
        {
            dp[i] = max(dp[i-2>0?(i-2):0] + ar[i], dp[i-3>0?(i-3):0] + ar[i]);
            if(dp[i] > maxi)
                maxi = dp[i];
        }
        cout << "Case " << x << ": " << maxi << endl;
    }
}
