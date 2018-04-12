#include<bits/stdc++.h>

using namespace std;

int BS(int ar[], int l, int r, int key)
{
    int m = 0;
    while(l <= r)
    {
        m = l + (r-l)/2;
        if(ar[m] > key)
        {
            if(ar[m-1] <= key)
                return m-1;
            else
                r = m - 1;
        }
        else
        {
            l = m + 1;
        }
    }
    return m;
}

int main()
{
    int n;
    cin >> n;
    int ar[n];
    int dp[n] = {0};
    for(int i = 0; i < n; i++)
    {
        cin >> ar[i];
    }
    sort(ar,ar+n);
    dp[0] = ar[0];
    for(int i = 1; i < n; i++)
    {
        dp[i] = dp[i-1] + ar[i];
    }
    int q;
    cin >> q;
    while(q--)
    {
        int x;
        cin >> x;
        int pos = BS(ar,0,n-1,x);
        cout << pos+1 << " " << dp[pos] << endl;
    }
}
