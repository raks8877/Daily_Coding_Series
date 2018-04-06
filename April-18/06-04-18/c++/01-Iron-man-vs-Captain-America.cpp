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
        int ar1[n+1] = {0};
        int ar2[n+1] = {0};
        int cost1[n+1] = {0};
        int cost2[n+1] = {0};
        for(int i = 1; i <= n; i++)
            cin >> ar1[i];
        for(int i = 1; i <= n; i++)
            cin >> ar2[i];
        for(int i = 2; i <= n; i++)
            cin >> cost1[i];
        for(int i = 2; i <= n; i++)
            cin >> cost2[i];
        int dp1[n+1] = {0};
        int dp2[n+1] = {0};
        dp1[1] = ar1[1];
        dp2[1] = ar2[1];
        
        for(int i = 2; i <= n; i++)
        {
            dp1[i] = min( dp1[i-1] + ar1[i], dp2[i-1] + ar1[i] + cost2[i]);
            dp2[i] = min( dp2[i-1] + ar2[i], dp1[i-1] + ar2[i] + cost1[i]);
        }
        cout << min(dp1[n] , dp2[n]) << endl;
        
    }
}
