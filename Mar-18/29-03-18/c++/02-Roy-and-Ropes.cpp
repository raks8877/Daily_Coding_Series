#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n;
        cin >> n;
        int dp[n+1] = {0};
        
        for(int i = 1; i < n; i++)
        {
            cin >> dp[i];
        }
        
        for(int i = 1; i < n; i++)
        {
            int val;
            cin >> val;
            dp[i] = max(dp[i], val);
        }
        
        int maxi = 0;
        for(int i = n - 1; i >= 1; i--)
        {
            dp[i] = dp[i] - (n-i);
            if(dp[i] > maxi)
                maxi = dp[i];
        }
        cout << n + maxi << endl;
    }
}
