#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        string str, nstr = "";
        cin >> str;
        int n = str.length();
        for(int i = 0; i < n; i++)
        {
            nstr += str[i];
            while(i < n && str[i] == str[i+1])
            {
                i++;
            }
        }
        cout << nstr << endl;
        
    }
}
