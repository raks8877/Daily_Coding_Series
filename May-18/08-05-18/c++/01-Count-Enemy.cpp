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
        int ans = 0;
        bool flag = false;
        for(int i = 0; i < n; i++)
        {
            if(str[i] == 'X')
                flag = true;
            if(str[i] == '*')
                flag = false;
            if(flag and str[i] == 'O')
                str[i] = '-';
        }
        flag = false;
        for(int i = n - 1; i >= 0; i--)
        {
            if(str[i] == 'X')
                flag = true;
            if(str[i] == '*')
                flag = false;
            if(flag and str[i] == 'O')
                str[i] = '-';
        }
        
        for(int i = 0; i < n; i++)
        {
            if(str[i] == 'O')
                ans += 1;
        }
        
        cout << ans << endl;
        
    }
}
