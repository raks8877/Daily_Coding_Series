#include<bits/stdc++.h>

using namespace std;

void solve(string str[], int n, string cmpstr)
{
    int len = cmpstr.length();
    int cnt = 0;
    bool flag = false;
    for(int i = 0; i < len; i++)
    {
        int l = str[cnt].length();
        flag = false;
        for(int j = 0; j < l; j++)
        {
            if(str[cnt][j] == cmpstr[i])
            {
                str[cnt][j] = '_';
                flag = true;
                break;
            }
        }
        if(flag)
        {
            cnt += 1;
            cnt %= n;
        }
        else
        {
            cout << "No\n";
            return;
            
        }
    }
    cout << "Yes\n";
    return;
    
}

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n, m;
        cin >> n >> m;
        string str[n];
        
        for(int i = 0; i < n; i++)
            cin >> str[i];
        
        string cmpstr;
        cin >> cmpstr;
        
        solve(str, n, cmpstr);
        
    }
    
}
