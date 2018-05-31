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
        int ar[27] = {0};
        for(int i = 0; i < n; i++)
        {
            int val = str[i] - 'a';
            ar[val] += 1;
        }
        int cnt = 0;
        for(int i = 0; i < 26; i++)
        {
            if(ar[i])
                cnt++;
        }
        if(cnt % 2 == 0)
            cout << "Player2\n";
        else
            cout << "Player1\n";
        
    }
}
