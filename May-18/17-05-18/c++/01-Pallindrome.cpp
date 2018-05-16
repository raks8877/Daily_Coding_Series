#include<bits/stdc++.h>

using namespace std;

bool pali(string str)
{
    int n = str.length();
    for(int i = 0; i < n/2; i++)
    {
        if(str[i] != str[n-1-i])
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
        if(pali(str))
            cout << "YES\n";
        else
            cout << "NO\n";
    }
}
