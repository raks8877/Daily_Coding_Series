#include<bits/stdc++.h>

using namespace std;

int check(char ch)
{
    if(ch == '0')
        return 6;
    else if(ch == '1')
        return 2;
    else if(ch == '2')
        return 5;
    else if(ch == '3')
        return 5;
    else if(ch == '4')
        return 4;
    else if(ch == '5')
        return 5;
    else if(ch == '6')
        return 6;
    else if(ch == '7')
        return 3;
    else if(ch == '8')
        return 7;
    else if(ch == '9')
        return 6;
    
}

int solu(string str)
{
    int ans = 0;
    int n = str.length();
    for(int i = 0; i < n; i++)
    {
        ans += check(str[i]);
    }
    return ans;
}

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n;
        cin >> n;
        string str, ans;
        int mini = INT_MAX;
        for(int i = 0; i < n; i++)
        {
            cin >> str;
            int val = solu(str);
            if(val < mini)
            {
                mini = val;
                ans = str;
            }
        }
        cout << ans << endl;
    }
}
