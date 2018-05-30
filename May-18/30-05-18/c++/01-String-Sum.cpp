#include<bits/stdc++.h>

using namespace std;

int main()
{
    string str;
    cin >> str;
    int n = str.length();
    int ans = 0;
    for(int i = 0; i < n; i++)
    {
        int val = str[i] - 'a';
        val += 1;
        ans += val;
    }
    cout << ans << endl;
}
