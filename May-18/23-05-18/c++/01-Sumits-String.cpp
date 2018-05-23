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
        int val = str[0] - 'a';
        bool flag = true;
        for(int i = 1; i < n; i++)
        {
            int val2 = str[i] - 'a';
            if(abs(val2 - val) != 1 and abs(val2 - val) != 25)
            {
                flag = false;
                break;
            }
            val = val2;
        }
        if(flag)
            cout << "YES\n";
        else
            cout << "NO\n";
    }
}
