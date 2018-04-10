#include<bits/stdc++.h>

using namespace std;

int count(string str, string word)
{
    int n = str.length();
    int len = word.length();
    int cnt = 0;
    bool flag;
    for(int i = 0; i < n; i++)
    {
        flag = true;
        for(int j = 0; j < len; j++)
        {
            if(i+j >= n)
            {
                flag = false;
                break;
            }
            if(str[i+j] != word[j])
            {
                flag = false;
                break;
            }
        }
        if(flag)
            cnt++;
    }
    return cnt;
}

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        string str;
        cin >> str;
        int cnt1 = count(str,"SUVOJIT");
        int cnt2 = count(str,"SUVO");
        cout << "SUVO = " << (cnt2-cnt1) << ", SUVOJIT = " << cnt1 <<endl;
    }
}
