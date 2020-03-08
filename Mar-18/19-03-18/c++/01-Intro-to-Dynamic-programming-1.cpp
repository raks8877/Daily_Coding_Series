#include<bits/stdc++.h>

using namespace std;
const int MOD = 1000000007;
long dp[100001] = {0};

void solu(long n)
{
    for(long i = 2; i <= n; i++)
    {
        dp[i] = ((dp[i-1] % MOD) * (i % MOD) ) % MOD;
    }
}


int main()
{
    dp[0] = dp[1] = 1;
    long n;
    cin >> n;
    long ar[n], maxi = 0;
    
    for(long i = 0; i < n; i++)
    {
        cin >> ar[i];
        if(ar[i] > maxi)
            maxi = ar[i];
    }
    solu(maxi);
    
    for(long i = 0; i < n; i++)
    {
        cout << dp[ ar[i] ] << endl;
    }
}
