#include<bits/stdc++.h>

using namespace std;
typedef long ll;
const int MOD = 1e9+7;

ll modularExponentiation(ll x,ll n,ll M)
{
    ll result=1;
    while(n>0)
    {
        if(n % 2 ==1)
            result=(result * x)%M;
        x=(x*x)%M;
        n=n/2;
    }
    return result;
}

int main()
{
    ll a,b;
    cin >> a >> b;
    cout << modularExponentiation(a,b,MOD) << endl;
    
}
