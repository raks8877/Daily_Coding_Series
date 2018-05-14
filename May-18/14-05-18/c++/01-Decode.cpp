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
        
        string ch[n];
        int cnt = n - 1;
        
        for(int i = n - 1; i >= 0; i -= 2)
        {
            ch[cnt] = str[i];
            cnt--;
        }
        
        
        int extra = 0;
        if(n % 2 != 0)
            extra += 1;
        
        for(int i = 0 + extra; i < n; i += 2)
            {
                ch[cnt] = str[i];
                cnt--;
            }
        
        for(int i = 0; i < n; i++)
        {
            cout << ch[i];
        }
        cout << endl;
        
    }
    
}
