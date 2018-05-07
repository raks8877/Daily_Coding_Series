
#include<bits/stdc++.h>

using namespace std;

void solu(string str, int n)
{
    int v1 = 0, v2 = 0, v3 = 0;
    int cnt1 = 0, cnt2 = 0;
    for(int i = 0; i < n; i++)
    {
        v1 = str[i] - 'a';
        v2 = str[i] - 'A';
        if(v1 >= 0 and v1 <= 25)
            cnt1++;
        else if(v2 >= 0 and v2 <= 25)
            cnt2++;
        
        
    }
    if(( cnt1 == 0 and cnt2 == 0) or (n < 1 or n > 100))
    {
        cout << "Invalid Input\n";
        return;
    }
    cout << min(cnt1, cnt2) << endl;
    return;
}

int main()
{
    int t;
    cin >> t;
    if(t < 1 or t > 10)
    {    cout << "Invalid Test\n";
        return 0;
    }
    
    while(t--)
    {
        string str;
        cin >> str;
        int n = str.length();
        solu(str, n);
    }
}
