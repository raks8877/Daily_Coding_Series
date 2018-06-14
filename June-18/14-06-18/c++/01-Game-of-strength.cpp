#include<bits/stdc++.h>

using namespace std;

const int MOD = 1e9 + 7;
typedef long long ll;


int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n;
        cin >> n;
        ll ar[n];
        ll maxi = 0;
        ll diff = 0;
        for(int i = 0; i < n; i++)
        {
            cin >> ar[i];
        }
        
        sort(ar,ar+n);
        maxi = ar[n-1];
        ll val = n - 1;
        for(int i = n-1; i >= 0; i--)
        {
            diff +=  val * ar[i] ;
            val -= 2;
        }
        
        
        
        ll ans = ((diff%MOD) * (maxi))%MOD;
        cout << ans << endl;
        
    }
}
