#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n, x, y;
    cin >> n >> x >> y;
    bool flag = true;
    
    for(int i = 0; i < n; i++)
    {
        int val;
        cin >> val;
        if(val < x or val > y)
            flag = false;
    }
    if(flag)
        cout << "YES\n";
    else
        cout << "NO\n";
}
