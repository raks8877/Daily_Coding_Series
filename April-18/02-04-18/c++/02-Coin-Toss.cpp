#include<bits/stdc++.h>

using namespace std;
typedef long long ll;
const int MOD = 1e9+7;

void multiply(ll F[3][3],ll M[3][3]);
void power(ll F[3][3],ll n);

ll fibo(ll n)
{
    if(n == 0)
        return 0;
    ll F[3][3] = {{0,0,1}, {1,0,1}, {0,1,1} };
    power(F,n);
    return F[2][2];
}



void power(ll F[3][3], ll n)
{
    if(n == 0 || n == 1)
        return;
    ll M[3][3] = {{0,0,1}, {1,0,1}, {0,1,1} };
    
    power(F,n/2);
    multiply(F,F);
    
    if(n % 2 != 0)
        multiply(F,M);
}

void multiply(ll F[3][3], ll M[3][3])
{
    ll a =( (F[0][0]%MOD)*(M[0][0]%MOD) + (F[0][1]%MOD)*(M[1][0]%MOD) + (F[0][2]%MOD)*(M[2][0]%MOD) ) % MOD;
    ll d =( (F[1][0]%MOD)*(M[0][0]%MOD) + (F[1][1]%MOD)*(M[1][0]%MOD) + (F[1][2]%MOD)*(M[2][0]%MOD) ) % MOD;
    ll g =( (F[2][0]%MOD)*(M[0][0]%MOD) + (F[2][1]%MOD)*(M[1][0]%MOD) + (F[2][2]%MOD)*(M[2][0]%MOD) ) % MOD;
    
    ll b =( (F[0][0]%MOD)*(M[0][1]%MOD) + (F[0][1]%MOD)*(M[1][1]%MOD) + (F[0][2]%MOD)*(M[2][1]%MOD) ) % MOD;
    ll e =( (F[1][0]%MOD)*(M[0][1]%MOD) + (F[1][1]%MOD)*(M[1][1]%MOD) + (F[1][2]%MOD)*(M[2][1]%MOD) ) % MOD;
    ll h =( (F[2][0]%MOD)*(M[0][1]%MOD) + (F[2][1]%MOD)*(M[1][1]%MOD) + (F[2][2]%MOD)*(M[2][1]%MOD) ) % MOD;
    
    ll c =( (F[0][0]%MOD)*(M[0][2]%MOD) + (F[0][1]%MOD)*(M[1][2]%MOD) + (F[0][2]%MOD)*(M[2][2]%MOD) ) % MOD;
    ll f =( (F[1][0]%MOD)*(M[0][2]%MOD) + (F[1][1]%MOD)*(M[1][2]%MOD) + (F[1][2]%MOD)*(M[2][2]%MOD) ) % MOD;
    ll i =( (F[2][0]%MOD)*(M[0][2]%MOD) + (F[2][1]%MOD)*(M[1][2]%MOD) + (F[2][2]%MOD)*(M[2][2]%MOD) ) % MOD;
    
    F[0][0] = a;
    F[0][1] = b;
    F[0][2] = c;
    
    F[1][0] = d;
    F[1][1] = e;
    F[1][2] = f;
    
    F[2][0] = g;
    F[2][1] = h;
    F[2][2] = i;
}


int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        ll n;
        cin >> n;
        cout << fibo(n+1) << endl;
    }
}
