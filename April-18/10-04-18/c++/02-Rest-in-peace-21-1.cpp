#include<bits/stdc++.h>

using namespace std;

string convert(int n)
{
    string str = "";
    while(n > 0)
    {
        int d = n % 10;
        str = (char)('0' + d) + str;
        n /= 10;
    }
    return str;
    
}

bool check(int n)
{
    string str = convert(n);
    int len = str.length();
    for(int i = 0; i < len; i++)
    {
        if(i+1 <= len)
        {
            if(str[i] == '2' && str[i+1] == '1')
            {
                return true;
            }
        }
    }
    return false;
}

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n;
        cin >> n;
        if(n % 21 == 0)
            cout << "The streak is broken!\n";
        else
        {
            if(check(n))
                cout << "The streak is broken!\n";
            else
                cout << "The streak lives still in our heart!\n";
        }
    }
}
