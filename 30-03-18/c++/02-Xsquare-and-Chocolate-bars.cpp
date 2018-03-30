#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    scanf("%d", &t);
    while(t--)
    {
        string str;
        cin >> str;
        int n = str.length();
        int dp[n+1] = {0};
        int maxi = 0;
        
        for(int i = 2; i < n; i++)
        {
            if(str[i] == str[i-1] && str[i] == str[i-2])
                dp[i] = 0;
            else
                dp[i] = (i-3>=0?dp[(i-3)]:0) + 1;
            
            if(dp[i] > maxi)
                maxi = dp[i];
        }
        
        maxi *= 3;
        cout << n - maxi << endl;
    }
}
