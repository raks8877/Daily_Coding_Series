#include <iostream>
using namespace std;
 
typedef long long ll;
 
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
 
ll d, x, y;
void extendedEuclid(ll A, ll B) {
    if(B == 0) {
        d = A;
        x = 1;
        y = 0;
    }
    else {
        extendedEuclid(B, A%B);
        ll temp = x;
        x = y;
        y = temp - (A/B)*y;
    }
}
ll modInverse(ll A, ll M)
{
    extendedEuclid(A,M);
    return (x%M+M)%M;    //x may be negative
}
int main()
{
    ll a,b,c,m;
    cin>>a>>b>>c>>m;
    ll ans=( (modularExponentiation(a,b,m)%m) * (modInverse(c,m)%m) )%m;
    cout<<ans<<endl;
    return 0;
}
