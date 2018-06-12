
#include<bits/stdc++.h>

using namespace std;

typedef long long ll;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n;
        cin >> n;
        n--;
        ll x = n / 3;
        ll y = n / 5;
        ll z = n / 15;
        ll s1 = 3 * (x*(x+1)/2);
        ll s2 = 5 * (y*(y+1)/2);
        ll s3 = 15 * (z*(z+1)/2);
        ll ans = s1+s2-s3;
        cout << ans << endl;
        
        
    }
}
