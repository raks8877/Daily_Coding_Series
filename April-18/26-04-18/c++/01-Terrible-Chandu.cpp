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
        for(int i = n-1; i >= 0; i--)
        {
            cout << str[i];
        }
        cout << endl;
    }
}
