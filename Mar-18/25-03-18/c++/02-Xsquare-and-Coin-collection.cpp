#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n, k;
        cin >> n >> k;
        int ar[n+1];
        ar[0] = 0;
        long dp[n+1] = {0};
        
        for(int i = 1; i <= n; i++)
        {
            cin>>ar[i];
            if(i > 1)
            {
                if(ar[i] <= k)
                    dp[i] = dp[i-1] + ar[i];
            }
            else if(ar[i] <= k)
            {
                dp[i] = ar[i];   
            }
        }
        
        long maxi = 0;
        for(int i = 1; i <= n; i++)
        {
            if(dp[i] > maxi)
                maxi = dp[i];
        }
        cout << maxi << endl;
    }
}
