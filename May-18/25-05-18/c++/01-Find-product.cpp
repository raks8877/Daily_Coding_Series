#include<bits/stdc++.h>

using namespace std;

const int MOD = 1e9+7;

int main()
{
    int n;
    cin >> n;
    long long ans = 1;
    
    for(int i = 0; i < n; i++)
    {
        long long val;
        cin >> val;
        ans = ((val%MOD) * (ans%MOD) )%MOD;
    }
    cout << ans << endl;
}
