#include<bits/stdc++.h>

using namespace std;
typedef long long ll;
ll a,b,c;
ll func(ll x)
{
    return (a*x*x) + (b*x) + c;
    
}

ll BS(ll k)
{
    ll l = 0, r = 1, m = 0, pos = 0;
    while(1)
    {
        ll val = func(r);
        if(val >= k)
            break;
        else
            r = r << 1;
    }
    
    while(l <= r)
    {
        m = l + (r-l)/2;
        ll val = func(m);
        if(val < k)
        {
            l = m + 1;
        }
        else
        {
            r = m - 1;
        }
        if(val >= k)
            pos = m;
    }
    return pos;
    
}


int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        ll k;
        cin >> a >> b >> c >> k;
        ll ans = BS(k);
        cout << ans << endl;
    }
    
}
