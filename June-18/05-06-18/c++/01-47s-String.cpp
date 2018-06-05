#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        string str;
        cin >> str;
        int n = str.length();
        long long ans = 0;
        int cnt = 0;
        
        for(int i = 0; i < n; i++)
        {
            if(str[i] == '$' or str[i] == '&')
            {
                ans = ans + (n-i) + ((n-i)*cnt);
                cnt = 0;
            }
            else
            {
                cnt += 1;
            }
        }
        cout << ans << endl;
    }
}
