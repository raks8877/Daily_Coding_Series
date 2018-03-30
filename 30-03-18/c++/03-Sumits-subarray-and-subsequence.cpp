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
        int ar[n+1] = {0};
        int dp[n+1] = {0};
        
        for(int i = 1; i <= n; i++)
        {
            cin >> ar[i];
            dp[i] = ar[i];
            
        }
        
        int maxi = INT_MIN, non_conti = 0;
        for(int i = 1; i <= n; i++)
        {
            dp[i] = max(dp[i-1] + ar[i], ar[i]);
            if(dp[i] > maxi)
                maxi = dp[i];
            if(ar[i] > 0)
                non_conti += ar[i];
        }
        
        //All negative numbers
        if(non_conti == 0)
        {
            non_conti = maxi;
        }
        
        cout << maxi << " " << non_conti << endl;
    }
}
