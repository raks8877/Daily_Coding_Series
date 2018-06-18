#include<bits/stdc++.h>

using namespace std;

int main()
{
    string str;
    cin >> str;
    int n = str.length();
    for(int  i = 0; i < n; i++)
    {
        int val = str[i] - 'a';
        if(val >=0 and val <= 26)
            cout << char('A' + val);
        else
            cout << char('a' + (str[i]-'A'));
    }
}
