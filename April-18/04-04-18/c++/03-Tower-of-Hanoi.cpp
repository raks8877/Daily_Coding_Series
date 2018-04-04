#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n;
        cin >> n;
        vector< pair<int,int> > vec;
        for(int i = 0; i < n; i++)
        {
            int a, b;
            cin >> a >> b;
            vec.push_back(make_pair(a,b));
        }
        sort(vec.begin(), vec.end());
        long dp[n+1] = {0};
        long maxi = 0;
        for(int i = n-1; i >= 0; i--)
        {
            long r1,h1;
            r1 = vec[i].first;
            h1 = vec[i].second;
            dp[i] = h1;
            for(int j = n-1; j > i; j--)
            {
                long r2,h2;
                r2 = vec[j].first;
                h2 = vec[j].second;
                if(r2 > r1 && h2 > h1)
                {
                    dp[i] = max(h1+dp[j], dp[i]);
                    
                }
            }
            maxi = max(dp[i],maxi);
        }
        cout << maxi << endl;
        
        
    }
}
