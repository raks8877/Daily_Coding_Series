#include<bits/stdc++.h>

using namespace std;

bool check(string str)
{
    int n = str.length();
    int cnt1,cnt0;
    cnt1 = cnt0 = 0;
    
    for(int i = 0; i < n; i++)
    {
        if(str[i] == '0')
        {
            cnt0 += 1;
            cnt1 = 0;
        }
        else
        {
            cnt1 += 1;
            cnt0 = 0;
        }
        if(cnt1 == 6 || cnt0 == 6)
        {
            return true;
        }
    }
    return false;
}

int main()
{
    string str;
    cin >> str;
    if(!check(str))
        cout << "Good luck!\n";
    else
        cout << "Sorry, sorry!\n";
}
