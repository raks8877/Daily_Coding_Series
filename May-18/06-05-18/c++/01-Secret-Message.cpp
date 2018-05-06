
#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n, k;
        cin >> n >> k;
        string str;
        cin >> str;
        
        for(int i = 0; i < n; i++)
        {
            int val1 = str[i] - 'a';
            int val2 = str[i] - 'A';
            int val3 = str[i] - '0';
            if(val1 >= 0 and val1 <= 26)
            {
                val1 = (val1 + k)%26;
                cout << char('a'+val1 );
            }
            else if(val2 >=0 and val2 <= 26)
            {
                val2 = (val2+k)%26;
                cout << char('A'+val2);
            }
            else if(val3 >= 0 and val3 <= 10)
            {
                val3 = (val3+k)%10;
                cout << char('0'+val3);
            }
            else
            {
                cout << str[i];
            }
            
        }
        cout << endl;
    }
    
}
