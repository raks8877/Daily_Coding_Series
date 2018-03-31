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
        int cnt[27] = {0};
        for(int i = 0; i < n; i++)
        {
            cnt[str[i] - 'a'] += 1;
        }
        
        bool flag = true;
        for(int i = 0; i < 26; i++)
        {
            if(cnt[i] % 2 != 0)
            {
                flag = false;
                break;
            }
        }
        
        if(flag)
            cout << "1\n";
        else
            cout << "-1\n";
        
    }
}
