#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n, q;
    cin >> n >> q;
    int ar1[n+1], ar2[n+1];
    ar1[0] = 0;
    ar2[0] = 0;
    for(int i = 1; i <= n; i++)
        cin >> ar1[i];
    for(int i = 1; i <= n; i++)
        cin >> ar2[i];
    
    long long dp1[n+1] = {0}, dp2[n+1] = {0};
    
    dp1[1] = ar1[1];
    dp2[1] = ar2[1];
    
    for(int i = 2; i <= n; i++)
    {
        if(i % 2 == 0)
        {
            dp1[i] = dp1[i-1] + ar2[i];
            dp2[i] = dp2[i-1] + ar1[i];
        }
        else
        {
            dp1[i] = dp1[i-1] + ar1[i];
            dp2[i] = dp2[i-1] + ar2[i];
        }
    }
    
    while(q--)
    {
        int a, x, y;
        cin >> a >> x >> y;
        
        if(a == 1)
        {
            if(x % 2 != 0 )
            {
                cout << (dp1[y] - dp1[x-1]) << endl;
            }
            else
            {
                cout << (dp2[y] - dp2[x-1]) << endl;
            }
        }
        else
        {
            if(x % 2 == 0 )
            {
                cout << (dp1[y] - dp1[x-1]) << endl;
            }
            else
            {
                cout << (dp2[y] - dp2[x-1]) << endl;
            }
        }
    }
    
}
