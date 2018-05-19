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
        int check[26] = {0};
        for(int i = 0; i < n; i++)
        {
            int val = str[i] - 'a';
            if(check[val] == 0)
            {
                check[val] = 1;
                cout << str[i];
            }
        }
        cout << endl;
    }
}
