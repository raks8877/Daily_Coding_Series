#include<bits/stdc++.h>

using namespace std;

bool check(string str)
{
    int n = str.length();
    bool a,e,i,o,u;
    a = e = i = o = u = false;
    for(int x = 0; x < n; x++)
    {
        if(str[x] == 'a')
            a = true;
        if(str[x] == 'e')
            e = true;
        if(str[x] == 'i')
            i = true;
        if(str[x] == 'o')
            o = true;
        if(str[x] == 'u')
            u = true;
    }
    if(a && e && i && o && u)
        return true;
    else
        return false;
}

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        string str;
        cin >> str;
        if(check(str))
            cout << "YES\n";
        else
            cout << "NO\n";
    }
}
