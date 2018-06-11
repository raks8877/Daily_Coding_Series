#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    while(n--)
    {
        string str;
        cin >> str;
        int len = str.length();
        for(int i = 0; i < len; i++)
        {
            int v1 = str[i] - 'a';
            int v2 = str[len-i-1] - 'a';
            int v = (v1 + v2 + 1) % 26;
            cout << char('a' + v);
            
        }
        cout << endl;
    }
}
