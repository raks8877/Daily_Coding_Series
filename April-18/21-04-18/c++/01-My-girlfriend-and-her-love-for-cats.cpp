#include<bits/stdc++.h>

using namespace std;
typedef unsigned long long int ll;

int main()
{
    int n;
    cin >> n;
    ll cat[n], cal[n];
    for(int i = 0; i < n; i++)
        cin >> cat[i];
    for(int i = 0; i < n; i++)
        cin >> cal[i];
    
    sort(cat, cat + n);
    sort(cal, cal + n);
    
    ll ans = 0;
    
    for(int i = n - 1; i >= 0; i--)
    {
        ans += (cat[i]*cal[i]);
    }
    cout << ans << endl;
}
