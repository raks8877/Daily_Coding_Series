#include<bits/stdc++.h>

using namespace std;

vector<int> prime;
int dp[10001] = {0};
void seive()
{
    int n = 10000;
    int check[n+1] = {0};
    for(int i = 2; i <= n; i++)
    {
        if(check[i] == 0)
        {
            prime.push_back(i);
            for(int j = 2*i; j <= n; j+=i)
            {
                check[j] = 1;  
            }
            //marking all prime numbers
            dp[i] = 1;
            
            if(i <= 5)
            {
                //marking all prime pow prime numbers
                int val = pow(i,i);
                if(val <= n)
                    dp[val] = 1;
            }
        }
    }
}



void solve()
{
    int n = 10000;
    dp[0] = dp[1] = n + 1 ;
    vector<int>::iterator j;
    for(int i = 2; i <= n; i++)
    {
        if(dp[i] != 1)
        {
            dp[i] = n + 1;
            for(j = prime.begin(); j != prime.end(); j++)
            {
                int val = (*j);
                if(val > i)
                    break;
                if(i-val >= 0)
                {    
                    dp[i] = min(dp[i-val] + 1, dp[i]);
                    if(val <= 5)
                    {
                        val = pow(val,val);
                        if( val <= n && i-val >= 0)
                        {
                            dp[i] = min(dp[i-val] + 1, dp[i]);
                        }    
                    }
                    
                }        
            }
            
        }
    }
    
    
}
int main()
{
    seive();
    solve();
    int t;
    cin >> t;
    while(t--)
    {
        int n;
        cin >> n;
        cout << dp[n] << endl;
    }
    
    
}
