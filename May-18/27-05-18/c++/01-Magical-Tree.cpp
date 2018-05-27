#include<bits/stdc++.h>

using namespace std;

int getnum(char ch)
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
    else
        return 9;
}


int main()
{
    int t, maxi = 0;
    cin >> t;
    while(t--)
    {
        string str;
        cin >> str;
        int n = str.length();
        int ans = 0;
        
        bool add, sub;
        add = sub = false;
        
        for(int i = 0; i < n; i++)
        {
            int val = str[i] - '0';
            if(val >=0 and val <= 10)
                val = getnum(str[i]);
            else if(str[i] == '+')
            {   
                add = true;
                sub = false;
            }
            else 
            {
                add = false;
                sub = true;
            }
            if( i % 2 == 0)
            {
                if(!add and !sub)
                    ans = val;
                else if(add)
                    ans += val;
                else if(sub)
                    ans -= val;
                
            }
        }
        if(ans > maxi)
                maxi = ans;
        
    }
    cout << maxi << endl;
        
}
