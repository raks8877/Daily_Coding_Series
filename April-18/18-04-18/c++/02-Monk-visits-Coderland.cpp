#include<bits/stdc++.h>

using namespace std;
typedef long long ll;

ll check(ll c[], ll l[], ll n)
{
    ll ans = 0;
    ll mini = INT_MAX;
    for(int i = 0; i < n; i++)
    {
        ans += (l[i] * min(c[i],mini));
        if(c[i] < mini)
            mini = c[i];
    }
    return ans;
}
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        ll n;
        cin >> n;
        ll c[n], l[n];
        for(int i = 0; i < n; i++)
            cin >> c[i];
        for(int i = 0; i < n; i++)
            cin >> l[i];
        ll ans = check(c,l,n);
        cout << ans << endl;
        
    }
}
