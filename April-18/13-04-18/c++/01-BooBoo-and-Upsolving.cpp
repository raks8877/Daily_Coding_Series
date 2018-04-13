#include<bits/stdc++.h>

using namespace std;
typedef long long ll;

int check(ll ar[], ll n, ll m, ll M)
{
    int cnt = 1;
    ll sum = 0;
    for(int i = 0; i < n; i++)
    {
        if(sum + ar[i] > m)
        {
            cnt++;
            sum = ar[i];
        }
        else
            sum += ar[i];
    }
    if(cnt <= M)
        return 1;
    else
        return 0;
}
ll BS(ll ar[], ll l, ll r, ll M, ll n)
{
    
    ll m;
    while(l <= r)
    {
        m = l + (r-l) / 2;
        ll pos = check(ar, n, m, M);
        if(pos)
            r = m - 1 ;
        else
            l = m + 1;
    }
    return l;
}

int main()
{
    ll n, m;
    cin >> n >> m;
    ll ar[n];
    ll maxi = 0;
    for(int i = 0; i < n; i++)
    {
        cin >> ar[i];
        if(ar[i] > maxi)
            maxi = ar[i];
    }
    
    cout << BS(ar,maxi,1e17, m, n) << endl;
}
