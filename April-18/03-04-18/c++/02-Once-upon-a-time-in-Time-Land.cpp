#include<bits/stdc++.h>

using namespace std;

typedef long long ll;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n, k;
        cin >> n >> k;
        ll ar[n+1] = {0};
        ll dp[n+1] = {0};
        ll maxi = 0;
        for(int i = 1; i <= n; i++)
        {
            cin >> ar[i];
            dp[i] = ar[i];
        }
        
        for(int i = 1; i <= n; i++)
        {
            if(i - (k+1) >= 0)
                dp[i] = max( maxi , ar[i] + dp[i-(k+1)] );
            else
                dp[i] = max(dp[i] , maxi);
            
            if(dp[i] > maxi)
                maxi = dp[i];
            
        }
        cout << maxi << endl;
    }
    
}
