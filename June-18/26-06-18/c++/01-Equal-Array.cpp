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
        int ar[n];
        ll sum[n] = {0};
        ll last[n+1] = {0};
        last[n] = 1e15;
        for(int i = 0; i < n; i++)
        {
            cin >> ar[i];
            sum[i] = ar[i];
            if(i != 0)
                sum[i] += sum[i-1];
        }
        
        for(int i = n-1; i >= 0; i--)
        {
            last[i] = ar[i];
            if(i != n-1)
                last[i] += last[i+1];
        }
        
        
        ll mini = LLONG_MAX;
        for(int i = 0; i < n-1; i++)
        {
            if(last[i+1] - sum[i] >=0)
                mini = min(mini, last[i+1] - sum[i]);
        }
        if(mini == LLONG_MAX)
            mini = -1;
        cout << mini << endl;
    }
    
}
