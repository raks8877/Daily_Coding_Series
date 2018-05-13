#include<bits/stdc++.h>

using namespace std;

int main()
{
    string str;
    cin >> str;
    int n = str.length();
    int flag[26] = {0};
    
    for(int i = 0; i < n; i++)
    {
        int val = str[i] - 'a';
        if(flag[val] == 0)
        {
            cout << str[i];
            flag[val] = 1;
        }
        else
            continue;
    }
}
