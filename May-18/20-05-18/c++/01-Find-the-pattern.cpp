#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    long mini = LONG_MAX, maxi = 0;
    
    for(int i = 0; i < n; i++)
    {
        long val;
        cin >> val;
        if(val > maxi)
            maxi = val;
        if(val < mini)
            mini = val;
    }
    long ans = maxi + mini;
    cout << ans << endl;
}
