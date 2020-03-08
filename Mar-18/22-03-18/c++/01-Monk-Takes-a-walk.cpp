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
        int len = str.length();
        int cnt = 0;
        
        for(int i = 0; i < len; i++)
        {
            if(tolower(str[i]) == 'a' ||
               tolower(str[i]) == 'e' ||
               tolower(str[i]) == 'i' ||
               tolower(str[i]) == 'o' ||
               tolower(str[i]) == 'u' )
               cnt++;
        }
        cout << cnt << endl;
    }
}
