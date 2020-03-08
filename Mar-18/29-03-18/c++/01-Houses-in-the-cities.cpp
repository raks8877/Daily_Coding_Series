
#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    scanf("%d", &t);
    while(t--)
    {
        int n;
        scanf("%d", &n);
        long dp[n+1] = {0};
        
        for(int i = 1; i <= n; i++)
        {
            int val;
            scanf("%d", &val);
            dp[i] = dp[i-1] + val;
        }
        
        int q;
        scanf("%d", &q);
        while(q--)
        {
            int x,  y;
            scanf("%d %d", &x, &y);
            printf("%ld\n", dp[y] - dp[x-1] );
        }
        
        
    }
}
