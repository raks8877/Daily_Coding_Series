#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    map<int, string> mp;
    for(int i = 0; i < n; i++)
    {
        int a;string str;
        cin >> a >> str;
        mp[a] = str;
    }
    int q;
    cin >> q;
    while(q--)
    {
        int x;
        cin >> x;
        cout << mp[x] << endl;
    }
}
