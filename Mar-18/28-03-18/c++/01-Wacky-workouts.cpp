#include<bits/stdc++.h>

using namespace std;

const long MOD = 1e9+7;


void multiply(long F[2][2], long M[2][2]);
 
void power(long F[2][2], long n);

long fibo(long n)
{
    long F[2][2] = { {1,1}, {1,0} };
    if(n == 0)
        return 0;
    power(F,n);
    return F[0][0];
}

void power(long F[2][2], long n)
{
  if( n == 0 || n == 1)
      return;
  long M[2][2] = {{1,1},{1,0}};
 
  power(F, n/2);
  multiply(F, F);
 
  if (n%2 != 0)
     multiply(F, M);
}
 
void multiply(long F[2][2], long M[2][2])
{
  long x = ( ( (F[0][0]%MOD)*(M[0][0]%MOD) ) + ( (F[0][1]%MOD)*(M[1][0]%MOD) ) ) %MOD;
  long y = ( ( (F[0][0]%MOD)*(M[0][1]%MOD) ) + ( (F[0][1]%MOD)*(M[1][1]%MOD) ) ) %MOD ;
  long z = ( ( (F[1][0]%MOD)*(M[0][0]%MOD) ) + ( (F[1][1]%MOD)*(M[1][0]%MOD) ) ) %MOD;
  long w = ( ( (F[1][0]%MOD)*(M[0][1]%MOD) ) + ( (F[1][1]%MOD)*(M[1][1]%MOD) ) ) %MOD ;

  F[0][0] = x;
  F[0][1] = y;
  F[1][0] = z;
  F[1][1] = w;
}


int main()
{
    long t;
    cin >> t;
    while(t--)
    {
        long n;
        cin >> n;
        cout << fibo(n+1) << endl;
        
    }
}
