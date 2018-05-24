#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin >> t;
    string str;
    while(t > 0)
    {
        getline(cin, str);
        int n = str.length();
        if(n > 0)
            t--;
        for(int i = 0; i < n; i++)
        {
            
            int val = str[i] - 'a';
            if(val < 0 or val > 26)
                val = str[i] - 'A';
            if(val < 0 or val > 26)
                val = -1;
            
            if(val == -1)
                cout << "$";
            else
                cout << val+1;
        }
        cout << endl;
    }
}
