#include<bits/stdc++.h>

using namespace std;

int val(char ch)
{
    if(ch == '0')
        return 0;
    else if(ch == '1')
        return 1;
    else if(ch == '2')
        return 2;
    else if(ch == '3')
        return 3;
    else if(ch == '4')
        return 4;
    else if(ch == '5')
        return 5;
    else if(ch == '6')
        return 6;
    else if(ch == '7')
        return 7;
    else if(ch == '8')
        return 8;
    else if(ch == '9')
        return 9;
    
    
}

int main()
{
    int t;
    cin >> t;
    
    while(t--)
    {
        string str;
        cin >> str;
        int len = str.length();
        int n = val(str[len-1]); 
        if(n % 2 == 0)
            cout << "YES\n";
        else
            cout << "NO\n";
    }
}
