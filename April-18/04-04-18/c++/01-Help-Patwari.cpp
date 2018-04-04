#include<bits/stdc++.h>

using namespace std;

typedef long long ll;

const int MOD = 1e9+7;
void multiply(ll F[2][2], ll M[2][2]);
void power(ll F[2][2], ll n);

ll fibo(ll n)
{
    ll F[2][2] = { {1,1}, {1,0} };
    if(n == 0  || n == 1)
        return 1;
    power(F,n);
    return F[0][0];
}

void power(ll F[2][2], ll n)
{
    if(n == 0 || n == 1)
        return;
    ll M[2][2] = { {1,1}, {1,0} };
    power(F, n/2);
    multiply(F,F);
    if(n % 2 != 0)
        multiply(F,M);
}

void multiply(ll F[2][2], ll M[2][2])
{
    ll a = ( (F[0][0]%MOD) * (M[0][0]%MOD) + (F[0][1]%MOD) * (M[1][0]%MOD) ) % MOD;
    ll b = ( (F[0][0]%MOD) * (M[0][1]%MOD) + (F[0][1]%MOD) * (M[1][1]%MOD) ) % MOD;
    
    ll c = ( (F[1][0]%MOD) * (M[0][0]%MOD) + (F[1][1]%MOD) * (M[1][0]%MOD) ) % MOD;
    ll d = ( (F[1][0]%MOD) * (M[0][1]%MOD) + (F[1][1]%MOD) * (M[1][1]%MOD) ) % MOD;
    
    F[0][0] = a;
    F[0][1] = b;
    F[1][0] = c;
    F[1][1] = d;
    
}



int main()
{
    int n;
    cin >> n;
    cout << fibo(n-1) << endl;
}
