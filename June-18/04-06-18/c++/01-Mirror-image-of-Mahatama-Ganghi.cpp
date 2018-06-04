#include<bits/stdc++.h>

using namespace std;

bool pali(string str, int n)
{
    for(int i = 0; i < n/2; i++)
    {
        if(str[i] != str[n-i-1])
            return false;
    }
    return true;
}

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        string str;
        cin >> str;
        int n = str.length();
        bool flag = false;
        
        for(int  i = 0; i < n; i++)
        {
            if(str[i] == '0' || str[i] == '1' || str[i] == '8')
                continue;
            else
            {    
                flag = true;
                break;
            }
        }
        if(flag)
            cout << "NO\n";
        else if(pali(str, n))
            cout << "YES\n";
        else
            cout << "NO\n";
        
        
    }
}
