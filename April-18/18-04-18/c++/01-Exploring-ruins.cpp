#include<bits/stdc++.h>

using namespace std;

int main()
{
    string str;
    cin >> str;
    int n = str.length();
    for(int i = 0; i < n; i++)
    {
        if(i+1 < n)
        {
            if(str[i] == '?')
            {
                if(str[i+1] == 'a' || str[i-1] == 'a')
                    str[i] = 'b';
                else
                    str[i] = 'a';
            }
        }
        else if(i == n-1)
        {
            if(str[i] == '?')
            {
                if(str[i-1] == 'a')
                    str[i] = 'b';
                else
                    str[i] = 'a';
            }
        }
    }
    cout << str << endl;
}
