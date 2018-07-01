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
        ll sad = 0;
        vector<pair<ll,ll> > vec;
        for(int i = 0; i < n; i++)
        {
            ll a, b;
            cin >> a >> b;
            sad += b;
            vec.push_back(make_pair(a+b, i));
        }
        
        sort(vec.begin(), vec.end());
        ll ans = vec[n-1].first + vec[n-2].first;
        ans -= sad;
        
        cout << ans << endl;
    }
    
}
