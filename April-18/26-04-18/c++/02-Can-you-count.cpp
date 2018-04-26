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
        
        int cnt = 0;
        int cnta = 0;
        int cnte = 0;
        int cnti = 0;
        int cnto = 0;
        int cntu = 0;
        
        unsigned long long ans = 1;
        
        for(int i = 0; i < n; i++)
        {
            if(str[i] == '_')
            {
                if(cnt != 0)
                {
                    ans *= cnt;
                }
            }
            if(str[i] == 'a')
                cnta = 1;
            if(str[i] == 'e')
                cnte = 1;
            if(str[i] == 'i')
                cnti = 1;
            if(str[i] == 'o')
                cnto = 1;
            if(str[i] == 'u')
                cntu = 1;
            cnt = cnta + cnte + cnti + cnto + cntu;
            
        }
        cout << ans << endl;
    }
    
}
